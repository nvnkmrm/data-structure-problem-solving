# Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

# You can use each character in text at most once. Return the maximum number of instances that can be formed.

# Example 1:

# Input: text = "nlaebolko"
# Output: 1
# Example 2:

# Input: text = "loonbalxballpoon"
# Output: 2
# Example 3:

# Input: text = "leetcode"
# Output: 0

# Constraints:

# 1 <= text.length <= 104
# text consists of lower case English letters only.

from collections import defaultdict,Counter

def max_number_of_balloons(text: str) -> int:
    baloon = "balloon"
    char_map = defaultdict(int)
    
    for char in text:
        if char in baloon:
            char_map[char] += 1
    
    if len(char_map) != 5:
        return 0
    
    occurrence = set()
    
    for key, value in char_map.items():
        if key == 'l' or key == 'o':
            occurrence.add(value//2)
        else:
            occurrence.add(value)
            
    return min(occurrence)

def max_number_of_balloons_2(text: str) -> int:
    counts = defaultdict(int)
    
    for char in text:
        counts[char] += 1
    
    return min(
        counts['b'],
        counts['a'],
        counts['l']//2,
        counts['o']//2,
        counts['n'],        
    )
    
def max_number_of_balloons_3(text: str) -> int:
    counts = Counter(text)
     
    return min(
        counts['b'],
        counts['a'],
        counts['l']//2,
        counts['o']//2,
        counts['n'],        
    )

import pytest

@pytest.mark.parametrize(
    'text, expected',
    [
        # Problem examples
        ('nlaebolko', 1),
        ('loonbalxballpoon', 2),
        ('leetcode', 0),

        # Exactly one "balloon"
        ('balloon', 1),

        # Multiple complete occurrences
        ('balloonballoon', 2),
        ('balloonballoonballoon', 3),

        # Missing one required character
        ('balloo', 0),          # missing 'n'
        ('ballon', 0),          # only one 'o'
        ('baloon', 0),          # only one 'l'
        ('ablloo', 0),          # missing 'n'

        # Insufficient repeated characters
        ('bbaalloonn', 1),      # only one pair of 'l' and one pair of 'o'
        ('bbbaaalllloooonnn', 2),

        # Extra unrelated characters should be ignored
        ('xxballoonyy', 1),
        ('xyzxyzxyz', 0),

        # Counts limited by different characters
        ('bbbbaaalllloooonnnn', 2),
        ('bbbbaaaallllooooonnnn', 2),
        ('bbbbbaaaaalllllloooooonnnnn', 3),

        # Large count scenario
        ('balloon' * 1000, 1000),

        # Constraint boundary: minimum length
        ('b', 0),

        # Constraint boundary: maximum length (10^4 characters)
        ('balloon' * 1428, 1428),  # length = 9996
    ]
)
def test_max_number_of_balloons(text: str, expected: int):
    assert max_number_of_balloons(text) == expected
    assert max_number_of_balloons_2(text) == expected
    assert max_number_of_balloons_3(text) == expected