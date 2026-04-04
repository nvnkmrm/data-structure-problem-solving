# Example 1: Given an integer array nums, an array queries where queries[i] = [x, y] and
# an integer limit, return a boolean array that represents the answer to each query.
# A query is true if the sum of the subarray from x to y is less than limit, or false otherwise.
#
# For example, given nums = [1, 6, 3, 2, 7, 2], queries = [[0, 3], [2, 5], [2, 4]], and limit = 13,
# the answer is [true, false, true]. For each query, the subarray sums are [12, 14, 12].


def subarray_sum_query(nums: list[int], limit: int, queries: list[list[int]]) -> list[bool]:
    prefix_sum = [nums[0]]

    for i in range(1, len(nums)):
        prefix_sum.append(nums[i] + prefix_sum[i-1])

    ans=[]

    for x, y in queries:

        sum_of_sub_array = prefix_sum[y] - prefix_sum[x] + nums[x]

        ans.append(sum_of_sub_array < limit)

    return ans

import pytest

@pytest.mark.parametrize(
    'nums, limit, query, expected',
    [
        ([1, 6, 3, 2, 7, 2], 13, [[0, 3], [2, 5], [2, 4]], [True, False, True]),
        ([5, 1, 2, 3, 4], 10, [[0, 2], [1, 3], [2, 4]], [True, True, True]),
        ([2, 2, 2, 2], 5, [[0, 1], [1, 3], [0, 3]], [True, False, False]),
        ([10, 20, 30], 25, [[0, 0], [1, 1], [0, 1]], [True, True, False]),
        ([1, 1, 1, 1, 1], 3, [[0, 2], [1, 3], [2, 4]], [False, False, False]),
        ([3, 5, 7, 1, 2], 8, [[0, 1], [3, 4], [2, 3]], [False, True, False]),
    ]
)
def test_subarray_sum_query(nums: list[int], limit: int, query: list[list[int]], expected: list[bool]):
    assert subarray_sum_query(nums, limit, query) == expected
