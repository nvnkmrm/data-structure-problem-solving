# Given an integer array nums, handle multiple queries of the following type:
#
# Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
# Implement the NumArray class:
#
# NumArray(int[] nums) Initializes the object with the integer array nums.
# int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive
# (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
#
#
# Example 1:
#
# Input
# ["NumArray", "sumRange", "sumRange", "sumRange"]
# [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
# Output
# [null, 1, -1, -3]
#
# Explanation
# NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
# numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
# numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
# numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
#
# Constraints:
#
# 1 <= nums.length <= 104
# -105 <= nums[i] <= 105
# 0 <= left <= right < nums.length
# At most 104 calls will be made to sumRange.

class NumArray:

    def __init__(self, nums: list[int]):
        self.nums = nums
        self.prefix = self.prefix_sum(nums)

    def prefix_sum(self, nums: list[int]) -> list[int]:
        prefix = [nums[0]]

        for i in range(1, len(nums)):
            prefix.append(nums[i] + prefix[i - 1])

        return prefix

    def sumRange(self, left: int, right: int) -> int:
        return self.prefix[right] - self.prefix[left] + self.nums[left]


import pytest


@pytest.mark.parametrize(
    'nums, left, right, expected',
    [
        ([-2, 0, 3, -5, 2, -1], 0, 2, 1),  # example case
        ([-2, 0, 3, -5, 2, -1], 2, 5, -1),  # example case
        ([-2, 0, 3, -5, 2, -1], 0, 5, -3),  # full range

        ([1], 0, 0, 1),  # single element

        ([5, -2, 7, 3], 1, 3, 8),  # subarray with negatives
        ([5, -2, 7, 3], 0, 0, 5),  # first element only
        ([5, -2, 7, 3], 3, 3, 3),  # last element only

        ([0, 0, 0, 0], 0, 3, 0),  # all zeros

        ([-1, -2, -3, -4], 0, 3, -10),  # all negatives
        ([-1, -2, -3, -4], 1, 2, -5),  # subarray negatives

        ([100000, -100000, 100000], 0, 2, 100000),  # boundary values
        ([100000, -100000, 100000], 1, 1, -100000),  # single large negative
    ]
)
def test_sum_range(nums: list[int], left: int, right: int, expected: int):
    num_array = NumArray(nums)
    assert num_array.sumRange(left, right) == expected