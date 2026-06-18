# Given a string s, return true if s is a good string, or false otherwise.

# A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

 

# Example 1:

# Input: s = "abacbc"
# Output: true
# Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
# Example 2:

# Input: s = "aaabb"
# Output: false
# Explanation: The characters that appear in s are 'a' and 'b'.
# 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 

# Constraints:

# 1 <= s.length <= 1000
# s consists of lowercase English letters.

from collections import defaultdict

def areOccurrencesEqual( s: str) -> bool:
    char_map = defaultdict(int)

    for char in s:
        char_map[char] += 1

    return len(set(char_map.values())) == 1


import pytest


@pytest.mark.parametrize(
    "s, expected",
    [
        ("abacbc", True),      # a=2, b=2, c=2
        ("aaabb", False),      # a=3, b=2
        ("a", True),           # a=1
        ("ab", True),          # a=1, b=1
        ("aabbcc", True),      # a=2, b=2, c=2
        ("aabbccc", False),    # a=2, b=2, c=3
        ("abcabcabc", True),   # a=3, b=3, c=3
        ("zzzz", True),        # z=4
        ("xyyz", False),       # x=1, y=2, z=1
        ("abababcc", False),   # a=3, b=3, c=2
    ],
)
def test_are_occurrences_equal(s: str, expected: bool):
    assert areOccurrencesEqual(s) == expected
