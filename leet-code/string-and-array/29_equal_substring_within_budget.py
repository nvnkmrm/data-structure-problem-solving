# You are given two strings s and t of the same length and an integer maxCost.
#
# You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]|
# (i.e., the absolute difference between the ASCII values of the characters).
#
# Return the maximum length of a substring of s that can be changed to be the same as
# the corresponding substring of t with a cost less than or equal to maxCost.
# If there is no substring from s that can be changed to its corresponding substring from t, return 0.
#
# Example 1:
#
# Input: s = "abcd", t = "bcdf", maxCost = 3
# Output: 3
# Explanation: "abc" of s can change to "bcd".
# That costs 3, so the maximum length is 3.
# Example 2:
#
# Input: s = "abcd", t = "cdef", maxCost = 3
# Output: 1
# Explanation: Each character in s costs 2 to change to character in t,  so the maximum length is 1.
# Example 3:
#
# Input: s = "abcd", t = "acde", maxCost = 0
# Output: 1
# Explanation: You cannot make any change, so the maximum length is 1.
#
# Constraints:
#
# 1 <= s.length <= 105
# t.length == s.length
# 0 <= maxCost <= 106
# s and t consist of only lowercase English letters.

def equal_substring(s: str, t: str, max_cost: int) -> int:
    left = 0
    curr = 0
    ans = 0

    for right, ch in enumerate(s):
        curr += abs(ord(ch) - ord(t[right]))

        while curr > max_cost:
            curr -= abs(ord(s[left]) - ord(t[left]))
            left += 1

        ans = max(ans, right - left + 1)

    return ans

import pytest

@pytest.mark.parametrize(
    's, t, max_cost, expected',
    [
        # Example test cases (given)
        ("abcd", "bcdf", 3, 3),
        ("abcd", "cdef", 3, 1),
        ("abcd", "acde", 0, 1),

        # Exact match (no cost needed)
        ("aaaa", "aaaa", 0, 4),

        # Single character cases
        ("a", "b", 1, 1),
        ("a", "c", 1, 0),

        # Entire string within budget
        ("abcd", "abcf", 2, 4),

        # Corrected cases
        ("abcd", "abzz", 3, 2),      # FIXED
        ("abcdxyz", "bcdfxyw", 5, 6),# FIXED
        ("abcdef", "ghijkl", 5, 0),  # FIXED

        # No valid substring
        ("abcd", "wxyz", 1, 0),

        # Zero budget but partial match
        ("abcd", "abef", 0, 2),

        # Alternating costs
        ("ababab", "bcbcbc", 3, 3),

        # Continuous small costs
        ("aaaaaa", "bbbbbb", 6, 6),
    ]
)
def test_equal_substring(s: str, t: str, max_cost: int, expected: int):
    assert equal_substring(s, t, max_cost) == expected