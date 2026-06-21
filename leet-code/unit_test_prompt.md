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
```

# Method Schema

Below is method schema

```
def no_of_subarrays(nums: list[int], k:int) -> int:
```
