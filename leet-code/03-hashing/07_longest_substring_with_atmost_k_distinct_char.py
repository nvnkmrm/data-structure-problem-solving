# Example 1: You are given a string s and an integer k. Find the length of the longest substring that contains at most k distinct characters.

# For example, given s = "eceba" and k = 2, return 3. The longest substring with at most 2 distinct characters is "ece".

from collections import defaultdict


# redid - 2
def find_longest_substring(s: str, k: int) -> int:
    count = defaultdict(int)
    left = ans = 0

    for right in range(len(s)):

        count[s[right]] += 1

        while len(count) > k:
            count[s[left]] -= 1

            if count[s[left]] == 0:
                del count[s[left]]

            left += 1

        ans = max(ans, right - left + 1)

    return ans


import pytest


@pytest.mark.parametrize(
    "s, k, expected",
    [
        ("eceba", 2, 3),  # "ece"
        ("araaci", 2, 4),  # "araa"
        ("araaci", 1, 2),  # "aa"
        ("araaci", 3, 5),  # "araac"
        ("cbbebi", 3, 5),  # "cbbeb" or "bbebi"
        ("aaaa", 1, 4),  # entire string
        ("abcabc", 2, 2),  # any two-character window
        ("abaccc", 2, 4),  # "accc"
        ("a", 1, 1),  # single character
        ("ab", 1, 1),  # either "a" or "b"
        ("ab", 2, 2),  # entire string
        ("aaabbb", 2, 6),  # entire string
    ],
)
def test_find_longest_substring(s: str, k: int, expected: int):
    assert find_longest_substring(s, k) == expected
