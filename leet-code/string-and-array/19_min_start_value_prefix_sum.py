# Given an array of integers nums, you start with an initial positive value startValue.
#
# In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
#
# Return the minimum positive value of startValue such that the step by step sum is never less than 1.
#
# Example 1:
#
#
# Input: nums = [-3,2,-3,4,2]
# Output: 5
# Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
# step by step sum
# startValue = 4 | startValue = 5 | nums
#   (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
#   (1 +2 ) = 3  | (2 +2 ) = 4    |   2
#   (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
#   (0 +4 ) = 4  | (1 +4 ) = 5    |   4
#   (4 +2 ) = 6  | (5 +2 ) = 7    |   2
#
#
# Example 2:
#
# Input: nums = [1,2]
# Output: 1
# Explanation: Minimum start value should be positive.
#
#
# Example 3:
#
# Input: nums = [1,-2,-3]
# Output: 5
#
# Constraints:
#
# 1 <= nums.length <= 100
# -100 <= nums[i] <= 100


def min_start_value(nums: list[int]) -> int:
    prefix = [nums[0]]

    for i in range(1, len(nums)):
        prefix.append(prefix[i - 1] + nums[i])

    min_prefix = min(prefix)

    if min_prefix < 0:
        return abs(min_prefix) + 1

    return 1


import pytest


@pytest.mark.parametrize(
    'nums, expected',
    [
        ([-3, 2, -3, 4, 2], 5),  # Example 1
        ([1, 2], 1),  # Example 2 (always positive)
        ([1, -2, -3], 5),  # Example 3 (drops below 1)

        ([-1, -2, -3], 7),  # all negatives → cumulative min = -6 → need 7
        ([2, 3, 5], 1),  # all positives → startValue = 1
        ([0, 0, 0], 1),  # zeros → never drops below 1
        ([-2, 3, -5, 4, -1], 5),  # mixed fluctuations
        ([1, -1, 1, -1], 1),  # oscillating but never below 0
        ([-5], 6),  # single negative
        ([5], 1),  # single positive
    ]
)
def test_min_start_value(nums: list[int], expected: int):
    assert min_start_value(nums) == expected