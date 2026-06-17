

# Given a 2D array nums that contains n arrays of distinct integers, return a sorted array containing all the numbers that appear in all n arrays.

# For example, given nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]], return [3, 4]. 3 and 4 are the only numbers that are in all arrays.

from collections import defaultdict

def intersection(nums: list[list[int]]) -> list[int]:
    count_map = defaultdict(int)

    for arr in nums:
        for num in arr:
            count_map[num] += 1
    
    ans = []
    n = len(nums)

    for key in count_map:
        if count_map[key] == n:
            ans.append(key)
    
    return sorted(ans)


import pytest


@pytest.mark.parametrize(
    "nums, expected",
    [
        ([[3, 1, 2, 4, 5], [1, 2, 3, 4], [3, 4, 5, 6]], [3, 4]),
        ([[1, 2, 3], [3, 4, 5], [3, 6, 7]], [3]),
        ([[1, 2], [3, 4], [5, 6]], []),
        ([[1, 2, 3], [1, 2, 3], [1, 2, 3]], [1, 2, 3]),
        ([[5, 4, 3, 2, 1]], [1, 2, 3, 4, 5]),
        ([[-3, -2, -1], [-1, 0, 1], [-1, 2, 3]], [-1]),
        ([[10, 20, 30], [30, 10, 40], [50, 10, 30]], [10, 30]),
        ([[7], [7], [7]], [7]),
        ([[1, 3, 5, 7], [7, 5, 3, 1], [3, 7, 9]], [3, 7]),
        ([[100, 200], [100, 300], [100, 400], [100, 500]], [100]),
    ],
)
def test_intersection(nums: list[list[int]], expected: list[int]):
    assert intersection(nums) == expected