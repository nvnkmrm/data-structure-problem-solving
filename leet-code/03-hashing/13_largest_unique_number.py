# Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.

# Example 1:

# Input: nums = [5,7,3,9,4,9,8,3,1]
# Output: 8
# Explanation: The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it is the answer.
# Example 2:

# Input: nums = [9,9,8,8]
# Output: -1
# Explanation: There is no number that occurs only once.
 

# Constraints:

# 1 <= nums.length <= 2000
# 0 <= nums[i] <= 1000

from collections import defaultdict

def largest_unique_number(nums: list[int]) -> int:
    ans = -1
    nums_count = defaultdict(int)
    
    for num in nums:
        nums_count[num] += 1
        
    for key, value in nums_count.items():
        if value == 1:
            ans = max(ans, key)
    
    return ans

import pytest

@pytest.mark.parametrize(
    'nums, expected',
    [
        # Example cases from problem statement
        ([5, 7, 3, 9, 4, 9, 8, 3, 1], 8),
        ([9, 9, 8, 8], -1),

        # Single element array (minimum constraint)
        ([5], 5),
        ([0], 0),

        # All elements are unique
        ([1, 2, 3, 4, 5], 5),

        # Largest number is unique
        ([1, 2, 3, 1000], 1000),

        # Largest number repeated, next largest unique should be returned
        ([1000, 1000, 999, 998, 998], 999),

        # Multiple unique values with duplicates mixed in
        ([2, 2, 3, 4, 4, 5], 5),

        # Only one unique value among many duplicates
        ([1, 1, 2, 2, 3, 3, 4], 4),

        # No unique values
        ([1, 1, 2, 2, 3, 3], -1),

        # Zero appears uniquely
        ([0, 1, 1, 2, 2], 0),

        # Zero repeated, larger unique value exists
        ([0, 0, 5, 5, 7], 7),

        # Boundary values from constraints
        ([0, 1000, 1000, 999], 999),

        # Largest boundary value is unique
        ([0, 0, 999, 999, 1000], 1000),

        # Multiple unique values, ensure maximum unique is selected
        ([10, 20, 20, 30, 30, 40, 50], 50),

        # Unique value appears before larger duplicated values
        ([100, 200, 300, 300, 400, 400], 200),

        # Array close to worst-case pattern with repeated values
        ([500] * 1000 + [999], 999),

        # Large duplicated values and one small unique value
        ([1000] * 1999 + [1], 1),
    ]
)
def test_largest_unique_number(nums: list[int], expected: int):
    assert largest_unique_number(nums) == expected