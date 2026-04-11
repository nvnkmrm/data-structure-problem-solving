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

# Program

```
# Given a string s, reverse the string according to the following rules:
#
# All the characters that are not English letters remain in the same position.
# All the English letters (lowercase or uppercase) should be reversed.
# Return s after reversing it.
#
# Example 1:
#
# Input: s = "ab-cd"
# Output: "dc-ba"
# Example 2:
#
# Input: s = "a-bC-dEf-ghIj"
# Output: "j-Ih-gfE-dCba"
# Example 3:
#
# Input: s = "Test1ng-Leet=code-Q!"
# Output: "Qedo1ct-eeLg=ntse-T!"
```
# Method Schema

Below is method schema

```
def reverse_only_letters(s: str) -> str:
```
