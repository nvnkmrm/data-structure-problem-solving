# We mentioned earlier that in most languages, strings are immutable.
# This means concatenating a single character to a string is an O(n) operation. If you have a string that is 1 million characters long,
# and you want to add one more character, all 1 million characters need to be copied over to another string.
#
# Many problems will ask you to return a string, and usually, this string will be built during the algorithm.
# Let's say the final string is of length n and we build it one character at a time with concatenation.
# What would the time complexity be? The operations needed at each step would be 1 + 2 + 3 + ... + n.
# This is the partial sum of this series, which leads to O(n^2) operation.)
#
# Simple concatenation will result in an big O of n^2 operation time complexity if you are using a language where strings are immutable.


def building_string(s: str) -> str:
    arr = []

    for i in s:
        arr.append(i)

    return "".join(arr)

import pytest

@pytest.mark.parametrize(
    's, expected',
    [
        ("abc", "abc"),
        ("", ""),
        ("a", "a"),
        ("hello", "hello"),
        ("12345", "12345"),
        ("!@#$%", "!@#$%"),
        ("a b c", "a b c"),
        ("AaBbCc", "AaBbCc"),
        ("longstringwithmultiplecharacters", "longstringwithmultiplecharacters"),
    ]
)
def test_building_string(s: str, expected: str):
    assert building_string(s) == expected