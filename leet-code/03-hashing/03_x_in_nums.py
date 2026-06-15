# Example 3: Given an integer array nums, find all the numbers x in nums that satisfy the following: x + 1 is not in nums, and x - 1 is not in nums.

# If a valid number x appears multiple times, you only need to include it in the answer once.

def x_in_nums(nums: list[int]) -> list[int]:
    ans = []
    nums_set = set(nums)
    
    for num in nums_set:
        
        if (num+1 not in nums_set) and (num-1 not in nums_set):
            ans.append(num)
    
    return ans

import pytest


@pytest.mark.parametrize(
    "nums, expected",
    [
        # Single isolated number
        ([5], [5]),

        # No isolated numbers
        ([1, 2, 3, 4, 5], []),

        # Isolated numbers at both ends
        ([1, 3, 5], [1, 3, 5]),

        # Mixed consecutive and isolated numbers
        ([1, 2, 4, 6, 7], [4]),

        # Negative numbers
        ([-3, -1, 0, 1, 3], [-3, 3]),

        # Consecutive negative numbers
        ([-2, -1, 0, 2], [2]),

        # Duplicate values should not affect result (set conversion)
        ([1, 1, 1, 3, 3, 5], [1, 3, 5]),

        # Multiple isolated numbers with duplicates
        ([10, 10, 12, 14, 14, 16], [10, 12, 14, 16]),

        # Consecutive blocks with one isolated number
        ([1, 2, 3, 10, 20, 21, 22], [10]),

        # Large gaps between numbers
        ([100, 200, 300], [100, 200, 300]),
    ],
)
def test_x_in_nums(nums: list[int], expected: list[int]):
    assert sorted(x_in_nums(nums)) == sorted(expected)