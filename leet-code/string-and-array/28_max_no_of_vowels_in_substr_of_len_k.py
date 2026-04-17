# Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
#
# Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
#
# Example 1:
#
# Input: s = "abciiidef", k = 3
# Output: 3
# Explanation: The substring "iii" contains 3 vowel letters.
# Example 2:
#
# Input: s = "aeiou", k = 2
# Output: 2
# Explanation: Any substring of length 2 contains 2 vowels.
# Example 3:
#
# Input: s = "leetcode", k = 3
# Output: 2
# Explanation: "lee", "eet" and "ode" contain 2 vowels.
#
# Constraints:
#
# 1 <= s.length <= 105
# s consists of lowercase English letters.
# 1 <= k <= s.length

# Redid - 1

def max_vowels(s: str, k: int) -> int:
    curr = left = 0
    vowels = ['a', 'e', 'i', 'o', 'u']

    for i in range(k):
        if s[i] in vowels:
            curr += 1

    max_count = curr

    for i in range(k, len(s)):

        if s[i] in vowels:
            curr += 1

        if s[left] in vowels:
            curr -= 1

        max_count = max(max_count, curr)

        left += 1

    return max_count

import pytest

@pytest.mark.parametrize(
    's, k, expected',
    [
        # Given examples
        ("abciiidef", 3, 3),   # "iii"
        ("aeiou", 2, 2),       # all substrings of size 2 → 2 vowels
        ("leetcode", 3, 2),    # "lee", "eet", "ode"

        # Minimum constraints
        ("a", 1, 1),
        ("z", 1, 0),

        # k equals string length
        ("aeiou", 5, 5),
        ("bcdfg", 5, 0),

        # No vowels
        ("bcdfghjkl", 3, 0),

        # All vowels
        ("aaaaaa", 3, 3),

        # Mixed distribution
        ("abcde", 2, 1),       # max("ab","bc","cd","de") → 1
        ("ababab", 3, 2),      # "aba" → 2

        # Window size 1
        ("aeiobcdf", 1, 1),

        # Vowels clustered
        ("bcdfaeiou", 4, 4),   # "aeio"
        ("aeioubcdf", 4, 4),   # "aeio"

        # Alternating vowels
        ("abecidofu", 3, 2),   # "abe","eci","ido","ofu"

        # Larger window
        ("abciiidef", 8, 5),   # "abciiide" → 4 vowels

        # Edge sliding behavior
        ("baaeei", 2, 2),      # "aa","ee","ei"
        ("aebcdiou", 3, 3),    # "iou"

        # k near length but not full
        ("aeiobcdfg", 8, 4),   # "aeiobcdf" → 4
    ]
)
def test_max_vowels(s: str, k: int, expected: int):
    assert max_vowels(s, k) == expected