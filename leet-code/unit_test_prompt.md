# Persona

You are expert in writing unit test in python. Below is the format.

```
import pytest

@pytest.mark.parametrize(     'nums, expected',     [         ('11001111', 5),         ('11001011', 4),         ('1101', 4),     ] ) 
def test_max_consecutive_ones_with_one_flip(nums: str, expected: int):     
    assert max_consecutive_ones_with_one_flip(nums) == expected
```

# Tasks

1. By following similar pattern writer a unit test for below program with different test cases. Utilise the method schema to write unit test.
2. Double check all the test cases are correct as per the program sure.
3. Consider the '# Constraints:' in program descript while generating test data.

# Program

```
# Given an array of integers nums, calculate the pivot index of this array.
#
# The pivot index is the index where the sum of all the numbers strictly to the left of
# the index is equal to the sum of all the numbers strictly to the index's right.
#
# If the index is on the left edge of the array, then the left sum is 0 because
# there are no elements to the left. This also applies to the right edge of the array.
#
# Return the leftmost pivot index. If no such index exists, return -1.
#
# Example 1:
#
# Input: nums = [1,7,3,6,5,6]
# Output: 3
# Explanation:
# The pivot index is 3.
# Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
# Right sum = nums[4] + nums[5] = 5 + 6 = 11
# Example 2:
#
# Input: nums = [1,2,3]
# Output: -1
# Explanation:
# There is no index that satisfies the conditions in the problem statement.
# Example 3:
#
# Input: nums = [2,1,-1]
# Output: 0
# Explanation:
# The pivot index is 0.
# Left sum = 0 (no elements to the left of index 0)
# Right sum = nums[1] + nums[2] = 1 + -1 = 0
#
# Constraints:
#
# 1 <= nums.length <= 104
# -1000 <= nums[i] <= 1000
```
# Method Schema

Below is method schema

```
def pivot_index(nums: list[int]) -> int:
```