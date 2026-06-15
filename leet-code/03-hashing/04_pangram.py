

def checkIfPangram(sentence: str) -> bool:
    pangram = set(sentence)
    
    return len(pangram) == 26


import pytest


@pytest.mark.parametrize(
    "sentence, expected",
    [
        # Exactly 26 unique lowercase letters
        ("abcdefghijklmnopqrstuvwxyz", True),

        # Valid pangram with letters in random order
        ("qwertyuiopasdfghjklzxcvbnm", True),

        # Missing one letter
        ("abcdefghijklmnopqrstuvwxy", False),

        # Empty string
        ("", False),

        # Single character
        ("a", False),

        # Repeated character only
        ("aaaaaaaaaaaaaaaaaaaaaaaaaa", False),

        # Pangram with duplicate letters
        ("abcdefghijklmnopqrstuvwxyzabc", True),

        # Missing multiple letters
        ("abcdefghijklm", False),

        # Letters in reverse order
        ("zyxwvutsrqponmlkjihgfedcba", True),

        # 25 unique letters with duplicates
        ("abcdefghijklmnopqrstuvwxyya", False),
    ],
)
def test_check_if_pangram(sentence: str, expected: bool):
    assert checkIfPangram(sentence) == expected