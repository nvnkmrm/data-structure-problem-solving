# Persona

You are expert in writing unit test in python. Below is the format.

```
import pytest

@pytest.mark.parametrize(     'nums, expected',     [         ('11001111', 5),         ('11001011', 4),         ('1101', 4),     ] )
def test_max_consecutive_ones_with_one_flip(nums: str, expected: int):
    assert max_consecutive_ones_with_one_flip(nums) == expected
```

# Tasks

1. By following similar pattern writer a unit test for below program with different test cases. Utilise the method schema to write unit test.
2. Double check all the test cases are correct as per the program sure.
3. Consider the '# Constraints:' in program descript while generating test data.

# Program

```
# You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

# Return a list answer of size 2 where:

# answer[0] is a list of all players that have not lost any matches.
# answer[1] is a list of all players that have lost exactly one match.
# The values in the two lists should be returned in increasing order.

# Note:

# You should only consider the players that have played at least one match.
# The testcases will be generated such that no two matches will have the same outcome.


# Example 1:

# Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
# Output: [[1,2,10],[4,5,7,8]]
# Explanation:
# Players 1, 2, and 10 have not lost any matches.
# Players 4, 5, 7, and 8 each have lost one match.
# Players 3, 6, and 9 each have lost two matches.
# Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].
# Example 2:

# Input: matches = [[2,3],[1,3],[5,4],[6,4]]
# Output: [[1,2,5,6],[]]
# Explanation:
# Players 1, 2, 5, and 6 have not lost any matches.
# Players 3 and 4 each have lost two matches.
# Thus, answer[0] = [1,2,5,6] and answer[1] = [].


# Constraints:

# 1 <= matches.length <= 105
# matches[i].length == 2
# 1 <= winneri, loseri <= 105
# winneri != loseri
# All matches[i] are unique.

from collections import defaultdict


def findWinners(matches: list[list[int]]) -> list[list[int]]:
        winners = defaultdict(int)
        loosers = defaultdict(int)

        for match in matches:
            winners[match[0]]+= 1
            loosers[match[1]] += 1

        non_loosers = [winner for winner in winners.keys() if winner not in loosers]
        exactly_one_loosers = [player for player,looses in loosers.items() if looses == 1]

        return [sorted(non_loosers), sorted(exactly_one_loosers)]
```

# Method Schema

Below is method schema

```
def findWinners(matches: list[list[int]]) -> list[list[int]]:
```
