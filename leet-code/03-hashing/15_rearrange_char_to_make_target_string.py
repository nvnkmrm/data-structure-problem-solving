# You are given two 0-indexed strings s and target. You can take some letters from s and rearrange them to form new strings.

# Return the maximum number of copies of target that can be formed by taking letters from s and rearranging them.

# Example 1:
# Input: s = "ilovecodingonleetcode", target = "code"
# Output: 2

# Explanation:
# For the first copy of "code", take the letters at indices 4, 5, 6, and 7.
# For the second copy of "code", take the letters at indices 17, 18, 19, and 20.
# The strings that are formed are "ecod" and "code" which can both be rearranged into "code".
# We can make at most two copies of "code", so we return 2.

# Example 2:
# Input: s = "abcba", target = "abc"
# Output: 1

# Explanation:
# We can make one copy of "abc" by taking the letters at indices 0, 1, and 2.
# We can make at most one copy of "abc", so we return 1.
# Note that while there is an extra 'a' and 'b' at indices 3 and 4, we cannot reuse the letter 'c' at index 2, so we cannot make a second copy of "abc".

# Example 3:
# Input: s = "abbaccaddaeea", target = "aaaaa"
# Output: 1

# Explanation:
# We can make one copy of "aaaaa" by taking the letters at indices 0, 3, 6, 9, and 12.
# We can make at most one copy of "aaaaa", so we return 1.
 
# Constraints:
# 1 <= s.length <= 100
# 1 <= target.length <= 10
# s and target consist of lowercase English letters.

def rearrange_characters(s: str, target: str) -> int:
    s_counter = Counter(s)
    target_counter = Counter(target)
    ans = 100

    for char,count in target_counter.items():
        ans = min(ans, s_counter[char]//count)
    return ans

import pytest


@pytest.mark.parametrize(
    's, target, expected',
    [
        # Problem examples
        ('ilovecodingonleetcode', 'code', 2),
        ('abcba', 'abc', 1),
        ('abbaccaddaeea', 'aaaaa', 1),

        # Exact match
        ('abc', 'abc', 1),
        ('aaaa', 'aaaa', 1),

        # Multiple copies
        ('abcabcabc', 'abc', 3),
        ('aaaaaa', 'aa', 3),
        ('zzzzzzzz', 'zz', 4),

        # Target contains duplicate characters
        ('aaaaaa', 'aaa', 2),
        ('aabbcc', 'abc', 2),
        ('aabbcc', 'aabb', 1),
        ('aaaabbbbcccc', 'abc', 4),
        ('aaaabbbbcccc', 'aabbcc', 2),

        # Missing required characters
        ('abc', 'abcd', 0),
        ('aaaa', 'b', 0),
        ('xyz', 'abc', 0),

        # Limited by one character count
        ('aabbccc', 'abc', 2),      # limited by a and b
        ('aaabbbcc', 'abc', 2),     # limited by c
        ('aaaabbbccc', 'aabc', 2),  # requires two a's per target

        # Single character target
        ('aaaaa', 'a', 5),
        ('bbbbbb', 'b', 6),
        ('cccc', 'd', 0),

        # Extra characters in s should be ignored
        ('abcxyzxyz', 'abc', 1),
        ('aabbccxyzxyz', 'abc', 2),

        # Constraint boundary: minimum lengths
        ('a', 'a', 1),
        ('a', 'b', 0),

        # Constraint boundary: maximum s length (100)
        ('a' * 100, 'a', 100),
        ('a' * 100, 'aa', 50),

        # Constraint boundary: maximum target length (10)
        ('abcdefghij', 'abcdefghij', 1),
        ('abcdefghijabcdefghij', 'abcdefghij', 2),
        ('a' * 100, 'aaaaaaaaaa', 10),  # target length = 10
    ]
)
def test_rearrange_characters(s: str, target: str, expected: int):
    assert rearrange_characters(s, target) == expected