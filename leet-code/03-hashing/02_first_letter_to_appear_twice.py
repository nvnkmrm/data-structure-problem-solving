



def repeatedCharacter(s: str) -> str:
    letter = set()

    for char in s:

        if char in letter:
            return char
        
        letter.add(char)
        
        
import pytest


@pytest.mark.parametrize(
    "s, expected",
    [
        ("abccbaacz", "c"),   # Example: c second occurrence appears first
        ("abcdd", "d"),      # Only d is repeated
        ("aabbcc", "a"),     # First character repeats earliest
        ("abcdde", "d"),     # Adjacent duplicate
        ("abac", "a"),       # a repeats before b/c
        ("xyzzxy", "z"),     # z second occurrence appears first
        ("leetcode", "e"),   # e repeats before others
        ("abcabc", "a"),     # Multiple repeats, a has earliest second occurrence
        ("mnopqrmn", "m"),   # Repeat occurs near the end
        ("zzzz", "z"),       # Same character repeated multiple times
    ],
)
def test_repeated_character(s: str, expected: str):
    assert repeatedCharacter(s) == expected