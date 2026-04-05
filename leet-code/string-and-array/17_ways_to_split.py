# Given an integer array nums, find the number of ways to split the array into two parts
# so that the first section has a sum greater than or equal to the sum of the second section.
# The second section should have at least one number.

# Input: nums = [10,4,-8,7]
# Output: 2
# Explanation:
# There are three ways of splitting nums into two non-empty parts:
# - Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 >= 3, i = 0 is a valid split.
# - Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 >= -1, i = 1 is a valid split.
# - Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 < 7, i = 2 is not a valid split.
# Thus, the number of valid splits in nums is 2.

def ways_to_split(nums: list[int]) -> int:
    prefix = [nums[0]]
    ans = 0

    for i in range(1, len(nums)):
        prefix.append(prefix[i - 1] + nums[i])

    for i in range(0, len(nums) - 1):
        left_section = prefix[i]
        right_section = prefix[-1] - prefix[i]

        if left_section >= right_section:
            ans += 1

    return ans

# Big O(1) space complexity
def ways_to_split_2(nums: list[int]) -> int:
    ans = left_section = 0
    total = sum(nums)

    for i in range(len(nums)-1):
        left_section  += nums[i]
        right_section = total - left_section

        if left_section >= right_section:
            ans += 1

    return ans

import pytest

@pytest.mark.parametrize(
    'nums, expected',
    [
        # Example case
        ([10, 4, -8, 7], 2),

        # Minimal valid input (2 elements)
        ([1, 1], 1),              # 1 >= 1 → valid
        ([1, 2], 0),              # 1 < 2 → invalid

        # All positive numbers
        ([1, 2, 3, 4, 5], 1),     # valid splits at index 2, 3

        # All negative numbers
        ([-1, -2, -3, -4], 2),

        # Mix of positive and negative
        ([5, -2, 3, -1, 2], 3),

        # Increasing sequence
        ([1, 2, 3, 4], 1),

        # Decreasing sequence
        ([4, 3, 2, 1], 2),

        # All zeros
        ([0, 0, 0, 0], 3),

        # Large values
        ([1000, -1000, 1000, -1000, 1000], 2),

        # Single valid split at end
        ([2, -1, 1], 2),
    ]
)
def test_ways_to_split(nums: list[int], expected: int):
    assert ways_to_split(nums) == expected
    assert ways_to_split_2(nums) == expected


