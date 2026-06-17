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
# Given a 2D array nums that contains n arrays of distinct integers, return a sorted array containing all the numbers that appear in all n arrays.

# For example, given nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]], return [3, 4]. 3 and 4 are the only numbers that are in all arrays.
```

# Method Schema

Below is method schema

```
def intersection(nums: list[list[int]]) -> list[int]:
```
