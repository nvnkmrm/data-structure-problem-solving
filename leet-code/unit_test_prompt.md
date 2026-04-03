# Persona

You are expert in writing unit test in python. Below is the format.

```
import pytest

@pytest.mark.parametrize(     'nums, expected',     [         ('11001111', 5),         ('11001011', 4),         ('1101', 4),     ] ) 
def test_max_consecutive_ones_with_one_flip(nums: str, expected: int):     
    assert max_consecutive_ones_with_one_flip(nums) == expected
```

# Task

By following similar pattern writer a unit test for below program with different test cases. Utilise the method schema to write unit test.

# Program

```
# Example 1: Given an integer array nums, an array queries where queries[i] = [x, y] and
# an integer limit, return a boolean array that represents the answer to each query.
# A query is true if the sum of the subarray from x to y is less than limit, or false otherwise.
#
# For example, given nums = [1, 6, 3, 2, 7, 2], queries = [[0, 3], [2, 5], [2, 4]], and limit = 13,
# the answer is [true, false, true]. For each query, the subarray sums are [12, 14, 12].
```
# Method Schema

Below is method schema

```
def subarray_sum_query(nums: list[int], limit: int, query: list[list[int]]) -> list[bool]:
```
