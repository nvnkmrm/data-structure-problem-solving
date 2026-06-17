

# Example 1: You are given a string s and an integer k. Find the length of the longest substring that contains at most k distinct characters.

# For example, given s = "eceba" and k = 2, return 3. The longest substring with at most 2 distinct characters is "ece".

from collections import defaultdict

def find_longest_substring(s: str, k: int) -> int:
    
    char_count = defaultdict(int)
    left = 0
    ans = 0
    
    for right, char in enumerate(s):
        
        char_count[char] += 1
        
        while len(char_count) > k:
            left_char = s[left]
            char_count[left_char] -= 1
            
            if char_count[left_char] == 0:
                del char_count[left_char]
            
            left += 1 
        
        ans = max(ans, right - left + 1)
    
    return ans


import pytest


@pytest.mark.parametrize(
    "s, k, expected",
    [
        ("eceba", 2, 3),      # "ece"
        ("araaci", 2, 4),     # "araa"
        ("araaci", 1, 2),     # "aa"
        ("araaci", 3, 5),     # "araac"
        ("cbbebi", 3, 5),     # "cbbeb" or "bbebi"
        ("aaaa", 1, 4),       # entire string
        ("abcabc", 2, 2),     # any two-character window
        ("abaccc", 2, 4),     # "accc"
        ("a", 1, 1),          # single character
        ("ab", 1, 1),         # either "a" or "b"
        ("ab", 2, 2),         # entire string
        ("aaabbb", 2, 6),     # entire string
    ],
)
def test_find_longest_substring(s: str, k: int, expected: int):
    assert find_longest_substring(s, k) == expected