# Given an array of integers nums, calculate the pivot index of this array.
#
# The pivot index is the index where the sum of all the numbers strictly to the left of
# the index is equal to the sum of all the numbers strictly to the index's right.
#
# If the index is on the left edge of the array, then the left sum is 0 because
# there are no elements to the left. This also applies to the right edge of the array.
#
# Return the leftmost pivot index. If no such index exists, return -1.
#
# Example 1:
#
# Input: nums = [1,7,3,6,5,6]
# Output: 3
# Explanation:
# The pivot index is 3.
# Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
# Right sum = nums[4] + nums[5] = 5 + 6 = 11
# Example 2:
#
# Input: nums = [1,2,3]
# Output: -1
# Explanation:
# There is no index that satisfies the conditions in the problem statement.
# Example 3:
#
# Input: nums = [2,1,-1]
# Output: 0
# Explanation:
# The pivot index is 0.
# Left sum = 0 (no elements to the left of index 0)
# Right sum = nums[1] + nums[2] = 1 + -1 = 0
#
# Constraints:
#
# 1 <= nums.length <= 104
# -1000 <= nums[i] <= 1000

def right_sum(index: int, nums: list[int], prefix: list[int]) -> int:
    if index == 0:
        return 0

    return prefix[index - 1] - prefix[0] + nums[0]


def left_sum(index: int, nums: list[int], prefix: list[int]) -> int:
    if index == len(nums) - 1:
        return 0

    return prefix[len(nums) - 1] - prefix[index + 1] + nums[index + 1]


def pivot_index(nums: list[int]) -> int:
    prefix = [nums[0]]

    for i in range(1, len(nums)):
        prefix.append(nums[i] + prefix[i - 1])

    for i in range(len(nums)):
        rsum = right_sum(i, nums, prefix)
        lsum = left_sum(i, nums, prefix)

        if rsum == lsum:
            return i

    return -1


import pytest

@pytest.mark.parametrize(
    'nums, expected',
    [
        # Example cases
        ([1, 7, 3, 6, 5, 6], 3),
        ([1, 2, 3], -1),
        ([2, 1, -1], 0),

        # Single element (edge case)
        ([5], 0),  # left = 0, right = 0

        # Two elements
        ([1, -1], -1),
        ([2, 3], -1),

        # All zeros
        ([0, 0, 0, 0], 0),  # leftmost pivot

        # Multiple pivots → return leftmost
        ([0, 0, 0], 0),

        # Negative numbers
        ([-1, -1, -1, -1, -1, -1], -1),

        # Mixed positive and negative
        ([-1, 1, 0], 2),   # left = 0, right = 0

        # Pivot in middle
        ([2, 3, -1, 8, 4], 3),
        # verify:
        # total = 16
        # index 3 → left = 2+3-1 = 4, right = 4 → match

        # Pivot at start
        ([0, 1, -1], 0),

        # Pivot at end
        ([1, -1, 0], 2),

        # No pivot with larger array
        ([1, 2, 3, 4, 5, 6], -1),

        # Large values within constraints
        ([1000, -1000, 1000, -1000, 0], 4),

        # Complex case
        ([3, -2, 2, -1, 1, -3, 3], 0),
        # total = 3
        # index 6 → left = 0, right = 0 → match

        # Another mixed case
        ([1, -1, 1, -1, 1, -1, 1], 0),  # leftmost valid pivot
    ]
)
def test_pivot_index(nums: list[int], expected: int):
    assert pivot_index(nums) == expected