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

class Solution:
    def largestUniqueNumber(self, nums: List[int]) -> int:
        ans = -1
        nums_count = defaultdict(int)

        for num in nums:
            nums_count[num] += 1

        for key, value in nums_count.items():
            if value == 1:
                ans = max(ans, key)

        return ans

```

# Method Schema

Below is method schema

```
def largest_unique_number(nums: list[int]) -> int:
```
