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
We can solve this in a straightforward manner - just iterate through nums and check if x + 1 or x - 1 is in nums. By converting nums into a set beforehand, these checks will cost

def x_in_nums(nums: list[int]) -> list[int]:
    ans = []
    nums_set = set(nums)

    for num in nums_set:

        if (num+1 not in nums_set) and (num-1 not in nums_set):
            ans.append(num)

    return ans

```

# Method Schema

Below is method schema

```
def x_in_nums(nums: list[int]) -> list[int]:
```
