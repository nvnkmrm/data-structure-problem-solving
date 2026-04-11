# Given a string s, reverse the string according to the following rules:
#
# All the characters that are not English letters remain in the same position.
# All the English letters (lowercase or uppercase) should be reversed.
# Return s after reversing it.
#
# Example 1:
#
# Input: s = "ab-cd"
# Output: "dc-ba"
# Example 2:
#
# Input: s = "a-bC-dEf-ghIj"
# Output: "j-Ih-gfE-dCba"
# Example 3:
#
# Input: s = "Test1ng-Leet=code-Q!"
# Output: "Qedo1ct-eeLg=ntse-T!"

def is_english_char(c: str) -> bool:
    return ('a' <= c <= 'z') or ('A' <= c <= 'Z')


def reverse_only_letters(s: str) -> str:
    chars = list(s)
    left = 0
    right = len(chars) - 1

    while left < right:

        if not is_english_char(chars[left]):
            left += 1
            continue

        if not is_english_char(chars[right]):
            right -= 1
            continue

        temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp

        left += 1
        right -= 1

    return "".join(chars)


import pytest

@pytest.mark.parametrize(
    's, expected',
    [
        # Given examples
        ("ab-cd", "dc-ba"),
        ("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
        ("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!"),

        # Only letters
        ("abcde", "edcba"),
        ("XYZ", "ZYX"),

        # No letters
        ("1234-+=!", "1234-+=!"),

        # Mixed with digits and symbols
        ("a1b2c3", "c1b2a3"),
        ("A!b@C#d$", "d!C@b#A$"),

        # Single character cases
        ("a", "a"),
        ("-", "-"),

        # Edge cases
        ("", ""),
        ("a-", "a-"),
        ("-a", "-a"),

        # Complex mix
        ("Ab,c,de!$", "ed,c,bA!$"),
        ("z<y>x", "x<y>z"),
    ]
)
def test_reverse_only_letters(s: str, expected: str):
    assert reverse_only_letters(s) == expected