
# Find the number of subarrays that have a sum exactly equal to k

# Imagine we had nums = [0, 1, 2, 3, 4] and k = 5.

from collections import defaultdict

def no_of_subarrays(nums: list[int], k:int) -> int:
    
    prefix_map = defaultdict(int)
    
    prefix_map[0] = 1
    
    curr_sum = 0
    count = 0
    
    for num in nums:
        curr_sum += num
        
        count += prefix_map[curr_sum - k]
        
        prefix_map[curr_sum] += 1

    return count
        
            
import pytest

@pytest.mark.parametrize(
    'nums, k, expected',
    [
        # Example from problem statement
        ([0, 1, 2, 3, 4], 5, 1),

        # Single element equal to k
        ([5], 5, 1),

        # Single element not equal to k
        ([5], 3, 0),

        # Multiple overlapping subarrays
        ([1, 1, 1], 2, 2),

        # All zeros
        ([0, 0, 0], 0, 6),

        # Entire array sums to k
        ([1, 2, 3], 6, 1),

        # Multiple subarrays with negative numbers
        ([1, -1, 1, -1, 1], 0, 6),

        # Negative numbers
        ([1, -1, 0], 0, 3),

        # Multiple matching subarrays
        ([3, 4, 7, 2, -3, 1, 4, 2], 7, 4),

        # No matching subarrays
        ([1, 2, 3], 10, 0),

        # Subarrays starting at index 0
        ([2, 3, 1], 5, 1),

        # Repeated prefix sums
        ([1, 2, 1, 2, 1], 3, 4),

        # Single zero
        ([0], 0, 1),

        # Multiple zeros and ones
        ([0, 1, 0, 1, 0], 1, 8),

        # Negative target
        ([-1, -1, 1], -1, 3),
    ]
)
def test_no_of_subarrays(nums: list[int], k: int, expected: int):
    assert no_of_subarrays(nums, k) == expected