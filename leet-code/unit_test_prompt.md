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
# Example 5: 1248. Count Number of Nice Subarrays

# Given an array of positive integers nums and an integer k. Find the number of subarrays with exactly k odd numbers in them.

# For example, given nums = [1, 1, 2, 1, 1], k = 3, the answer is 2. The subarrays with 3 odd numbers in them are [1, 1, 2, 1, 1] and [1, 1, 2, 1, 1]

from collections import defaultdict

def count_no_of_sub_arrays(nums: list[int], k:int) -> int:
    counts = defaultdict(int)
    curr = ans  = 0

    for num in nums:

        curr += num%2

        ans += counts[curr-k]

        counts[curr] += 1

    return ans
```

# Method Schema

Below is method schema

```
def count_no_of_sub_arrays(nums: list[int], k:int) -> int:
```
