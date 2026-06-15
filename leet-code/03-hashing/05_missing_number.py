# Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

# Example 1:
# Input: nums = [3,0,1]
# Output: 2
# Explanation:
# n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

# Example 2:
# Input: nums = [0,1]
# Output: 2
# Explanation:
# n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

# Example 3:
# Input: nums = [9,6,4,2,3,5,7,0,1]
# Output: 8
# Explanation:
# n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

# Constraints:

# n == nums.length
# 1 <= n <= 104
# 0 <= nums[i] <= n
# All the numbers of nums are unique.
 

# Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?


def sum_of_natural_number(n: int) -> int:
        return int((n *(n+1))/2)
    
def missingNumber(nums: list[int]) -> int:
    
    sum_of_n = sum_of_natural_number(len(nums))
    
    for num in nums:
        
        sum_of_n -= num
    
    return sum_of_n


import pytest


@pytest.mark.parametrize(
    "nums, expected",
    [
        # Examples from the problem statement
        ([3, 0, 1], 2),
        ([0, 1], 2),
        ([9, 6, 4, 2, 3, 5, 7, 0, 1], 8),

        # Missing first number
        ([1], 0),
        ([1, 2, 3, 4], 0),

        # Missing last number (n)
        ([0], 1),
        ([0, 1, 2, 3], 4),

        # Missing number in the middle
        ([0, 2], 1),
        ([0, 1, 3], 2),
        ([0, 1, 2, 4, 5], 3),

        # Unsorted input
        ([4, 2, 1, 0], 3),
        ([5, 0, 1, 2, 4], 3),

        # Larger range
        ([10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0], 11),
        ([11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1], 0),
    ],
)
def test_missing_number(nums: list[int], expected: int):
    assert missingNumber(nums) == expected