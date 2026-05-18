# Given a string s, reverse the order of characters in each word within a sentence
# while still preserving whitespace and initial word order.
#
# Example 1:
# Input: s = "Let's take LeetCode contest"
# Output: "s'teL ekat edoCteeL tsetnoc"

# Example 2:
# Input: s = "Mr Ding"
# Output: "rM gniD"

def reverse_words_in_string(s: str) -> str:
    ans = []

    for word in s.split(" "):

        left = 0
        right = len(word) - 1
        chars = list(word)

        while left < right:
            temp = chars[left]
            chars[left] = chars[right]
            chars[right] = temp

            left += 1
            right -= 1

        ans.append("".join(chars))

    return " ".join(ans)

import pytest

@pytest.mark.parametrize(
    's, expected',
    [
        ("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"),
        ("Mr Ding", "rM gniD"),
        ("Hello World", "olleH dlroW"),
        ("a b c", "a b c"),  # single character words
        ("Python", "nohtyP"),  # single word
        ("  double  space  ", "  elbuod  ecaps  "),  # leading, trailing, multiple spaces
        ("123 456", "321 654"),  # numeric characters
        ("!@# $%^", "#@! ^%$"),  # special characters
        ("", ""),  # empty string
        ("    ", "    "),  # only spaces
    ]
)
def test_reverse_words(s: str, expected: str):
    assert reverse_words_in_string(s) == expected

