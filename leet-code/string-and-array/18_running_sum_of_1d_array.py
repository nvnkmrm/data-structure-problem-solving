# Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
#
# Return the running sum of nums.
#
# Example 1:
#
# Input: nums = [1,2,3,4]
# Output: [1,3,6,10]
# Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
#
# Example 2:
#
# Input: nums = [1,1,1,1,1]
# Output: [1,2,3,4,5]
# Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

def running_sum(nums: list[int]) -> list[int]:
    if(len(nums) == 0):
        return []

    prefix = [nums[0]]

    for i in range(1, len(nums)):
        prefix.append(nums[i] + prefix[i - 1])

    return prefix


import pytest

@pytest.mark.parametrize(
    'nums, expected',
    [
        # Basic cases
        ([1, 2, 3, 4], [1, 3, 6, 10]),
        ([1, 1, 1, 1, 1], [1, 2, 3, 4, 5]),

        # Single element
        ([5], [5]),

        # Includes zero
        ([0, 1, 2, 3], [0, 1, 3, 6]),

        # All zeros
        ([0, 0, 0], [0, 0, 0]),

        # Negative numbers
        ([-1, -2, -3], [-1, -3, -6]),

        # Mix of positive and negative
        ([3, -1, 2, -2, 5], [3, 2, 4, 2, 7]),

        # Larger values
        ([10, 20, 30], [10, 30, 60]),

        # Edge: empty list
        ([], []),
    ]
)
def test_running_sum(nums: list[int], expected: list[int]):
    assert running_sum(nums) == expected

