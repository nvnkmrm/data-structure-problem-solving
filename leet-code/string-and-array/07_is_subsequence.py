# Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
#
# A subsequence of a string is a new string that is formed from the original string by
# deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
# (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
#
# Example 1:
#
# Input: s = "abc", t = "ahbgdc"
# Output: true
# Example 2:
#
# Input: s = "axc", t = "ahbgdc"
# Output: false

import pytest


def is_subsequence(str1, str2):
    i = j = 0

    while i < len(str1) and j < len(str2):
        if str1[i] == str2[j]:
            i += 1
        j += 1

    return i == len(str1)


@pytest.mark.parametrize("str1, str2, expected", [
    ("abc", "ahbgdc", True),
    ("axc", "ahbgdc", False),
    ("abcc", "abczxc", True),
    ("", "abc", True),
    ("abc", "", False),
])
def test_is_subsequence(str1, str2, expected):
    assert is_subsequence(str1, str2) == expected


if __name__ == "__main__":
    print(is_subsequence("abcc", "abczxc"))
