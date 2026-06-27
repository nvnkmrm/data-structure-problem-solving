# Example 5: 1248. Count Number of Nice Subarrays

# Given an array of positive integers nums and an integer k. Find the number of subarrays with exactly k odd numbers in them.

# For example, given nums = [1, 1, 2, 1, 1], k = 3, the answer is 2. The subarrays with 3 odd numbers in them are [1, 1, 2, 1, 1] and [1, 1, 2, 1, 1]

from collections import defaultdict

#redid - 1
def count_no_of_sub_arrays(nums: list[int], k:int) -> int:
    counts = defaultdict(int)
    counts[0] = 1
    curr = ans = 0
    
    for num in nums:
        curr += num%2
        ans += counts[curr - k]
        counts[curr] += 1
    
    return ans

import pytest

@pytest.mark.parametrize(
    'nums, k, expected',
    [
        # Example from problem statement
        ([1, 1, 2, 1, 1], 3, 2),

        # Single odd number matching k
        ([1], 1, 1),

        # Single even number cannot form a nice subarray
        ([2], 1, 0),

        # Entire array contains exactly k odd numbers
        ([1, 2, 3, 4, 5], 3, 1),

        # Multiple overlapping nice subarrays
        ([2, 2, 1, 2, 2, 1, 2, 2], 2, 9),

        # All numbers are odd
        ([1, 3, 5, 7], 2, 3),

        # All numbers are even
        ([2, 4, 6, 8], 1, 0),

        # Exactly one odd number with multiple surrounding evens
        ([2, 2, 1, 2, 2], 1, 9),

        # Nice subarrays starting from index 0
        ([1, 2, 2, 2], 1, 4),

        # Nice subarrays ending at last index
        ([2, 2, 2, 1], 1, 4),

        # Multiple valid windows
        ([1, 2, 1, 2, 1], 2, 4),

        # k larger than number of odd numbers present
        ([1, 2, 3], 3, 0),

        # Consecutive odd numbers
        ([1, 1, 1, 1], 3, 2),
    ]
)
def test_count_no_of_sub_arrays(nums: list[int], k: int, expected: int):
    assert count_no_of_sub_arrays(nums, k) == expected