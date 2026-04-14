# Given an array of positive integers nums and a positive integer target,
# return the minimal length of a subarray whose sum is greater than or equal to target.
# If there is no such subarray, return 0 instead.
#
# Example 1:
#
# Input: target = 7, nums = [2,3,1,2,4,3]
# Output: 2
# Explanation: The subarray [4,3] has the minimal length under the problem constraint.
# Example 2:
#
# Input: target = 4, nums = [1,4,4]
# Output: 1
# Example 3:
#
# Input: target = 11, nums = [1,1,1,1,1,1,1,1]
# Output: 0
#
#
# Constraints:
#
# 1 <= target <= 109
# 1 <= nums.length <= 105
# 1 <= nums[i] <= 104

def min_sub_array_len(target: int, nums: list[int]) -> int:
    left = 0
    curr = 0
    min_len = len(nums) + 1

    for right in range(len(nums)):
        curr += nums[right]

        while curr >= target:
            sub_array_size = right - left + 1
            if sub_array_size < min_len:
                min_len = sub_array_size
            curr -= nums[left]
            left += 1

    if min_len == len(nums) + 1:
        return 0

    return min_len

def min_sub_array_len_v2(target: int, nums: list[int]) -> int:
    left = curr = 0
    min_len = float('inf')

    for right, num in enumerate(nums):
        curr += num

        while curr >= target:
            min_len = min(min_len, right - left + 1)
            curr -= nums[left]
            left += 1

    return 0 if min_len == float('inf') else min_len


import pytest

@pytest.mark.parametrize(
    "target, nums, expected",
    [
        # Given examples
        (7, [2, 3, 1, 2, 4, 3], 2),   # [4,3]
        (4, [1, 4, 4], 1),            # [4]
        (11, [1, 1, 1, 1, 1, 1, 1, 1], 0),

        # Single element cases
        (5, [5], 1),
        (6, [5], 0),

        # Entire array needed
        (15, [1, 2, 3, 4, 5], 5),

        # Subarray at the beginning
        (5, [2, 3, 1, 1, 1], 2),      # [2,3]

        # Subarray at the end
        (7, [1, 1, 1, 2, 3, 4], 2),   # [3,4]

        # Multiple possible subarrays, pick minimal
        (8, [3, 1, 1, 1, 5, 1, 2], 3),  # [5,1] or [1,2,5] -> minimal is 2

        # No valid subarray
        (100, [1, 2, 3, 4, 5], 0),

        # Large values
        (10000, [10000], 1),
        (10001, [10000], 0),

        # Gradual accumulation
        (6, [1, 2, 3], 3),

        # Minimal window in middle
        (9, [1, 2, 3, 4, 5], 2),  # [4,5]

        # Repeated numbers
        (6, [2, 2, 2, 2], 3),  # [2,2,2]

        # Edge: many small numbers
        (10, [1] * 20, 10),
    ]
)
def test_min_sub_array_len(target: int, nums: list[int], expected: int):
    assert min_sub_array_len(target, nums) == expected
    assert min_sub_array_len_v2(target, nums) == expected