# Given a 0-indexed string word and a character ch, reverse the segment of word that
# starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
# If the character ch does not exist in word, do nothing.
#
# For example, if word = "abcdefd" and ch = "d", then you should reverse the segment
# that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
# Return the resulting string.
#
# Example 1:
#
# Input: word = "abcdefd", ch = "d"
# Output: "dcbaefd"
# Explanation: The first occurrence of "d" is at index 3.
# Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
#
# Example 2:
# Input: word = "xyxzxe", ch = "z"
# Output: "zxyxxe"
# Explanation: The first and only occurrence of "z" is at index 3.
# Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
#
# Example 3:
# Input: word = "abcd", ch = "z"
# Output: "abcd"
# Explanation: "z" does not exist in word.
# You should not do any reverse operation, the resulting string is "abcd".
#
# Constraints:
#
# 1 <= word.length <= 250
# word consists of lowercase English letters.
# ch is a lowercase English letter.

def reverse_prefix(word: str, ch: str) -> str:
    right = -1
    left = 0

    for i in range(len(word)):
        if word[i] == ch:
            right = i
            break

    if right == -1:
        return word

    chars = list(word)

    while left < right:
        temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp

        left += 1
        right -= 1

    return "".join(chars)

def reverse_prefix_v2(word: str, ch: str) -> str:
    for i, c in enumerate(word):
        if c == ch:
            return word[:i + 1][::-1] + word[i + 1:]
    return word

import pytest

@pytest.mark.parametrize(
    "word, ch, expected",
    [
        # Example test cases (given)
        ("abcdefd", "d", "dcbaefd"),
        ("xyxzxe", "z", "zxyxxe"),
        ("abcd", "z", "abcd"),

        # Edge cases
        ("a", "a", "a"),                  # single character, match
        ("a", "z", "a"),                  # single character, no match
        ("abc", "a", "abc"),              # first character match (no visible change)

        # Multiple occurrences (should reverse up to FIRST occurrence only)
        ("abacada", "a", "abacada"),      # first 'a' at index 0 → no change
        ("abcdefa", "a", "abcdefa"),      # first 'a' at index 0
        ("baac", "a", "abac"),            # first 'a' at index 1 → reverse "ba" → "ab"

        # Middle occurrence
        ("abcdef", "c", "cbadef"),        # reverse till index 2

        # Last character occurrence
        ("abcdef", "f", "fedcba"),        # full reverse

        # No occurrence
        ("xyz", "a", "xyz"),

        # Repeated characters
        ("aaaaa", "a", "aaaaa"),          # first occurrence at index 0
        ("bbbbb", "b", "bbbbb"),          # same case

        # Mixed cases
        ("zxyabc", "y", "yxzabc"),        # reverse "zxy" → "yxz"
        ("helloworld", "w", "wollehorld"),# reverse till 'w'

        # Near constraint limits (length behavior)
        ("a" * 249 + "b", "b", "b" + "a" * 249),  # max boundary-like case
    ]
)
def test_reverse_prefix(word: str, ch: str, expected: str):
    assert reverse_prefix(word, ch) == expected
    assert reverse_prefix_v2(word, ch) == expected