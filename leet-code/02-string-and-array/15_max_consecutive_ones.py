# Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

# Example 1:
#
# Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
# Output: 6
# Explanation: [1,1,1,0,0,1,1,1,1,1,1]
# Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
# Example 2:
#
# Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
# Output: 10
# Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
# Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

def longest_ones(nums: list[int], k: int) -> int:
    left = 0
    ans = 0
    curr = 0

    for right in range(len(nums)):

        if nums[right] == 0:
            curr += 1

        while curr > k:
            if nums[left] == 0:
                curr -= 1
            left += 1

        ans = max(ans, right - left + 1)

    return ans

import pytest

@pytest.mark.parametrize(
    'nums, k, expected',
    [
        # Given examples
        ([1,1,1,0,0,0,1,1,1,1,0], 2, 6),
        ([0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], 3, 10),

        # All 1s (no flip needed)
        ([1,1,1,1,1], 2, 5),

        # All 0s (flip limited by k)
        ([0,0,0,0], 2, 2),

        # k = 0 (no flips allowed)
        ([1,0,1,1,0,1], 0, 2),

        # Single element cases
        ([1], 0, 1),
        ([0], 1, 1),

        # k greater than number of 0s
        ([1,0,1,1,0], 10, 5),

        # Alternating pattern
        ([1,0,1,0,1,0,1], 2, 5),

        # Longest sequence at the start
        ([0,0,1,1,1,1], 1, 5),

        # Longest sequence at the end
        ([1,1,0,0,1,1,1], 2, 7),

        # Complex mix
        ([1,0,1,1,0,1,0,1,1,1,0], 2, 8),
    ]
)
def test_longest_ones(nums: list[int], k: int, expected: int):
    assert longest_ones(nums, k) == expected