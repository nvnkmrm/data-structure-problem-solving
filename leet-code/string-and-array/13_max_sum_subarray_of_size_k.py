# Example 4: Given an integer array nums and an integer k, find the sum of the subarray with the largest sum whose length is k.

def max_sum_subarray_of_size_k(nums: list[int], k: int) -> int:
    curr = 0
    ans = 0

    for i in range(k):
        curr += nums[i]

    ans = curr

    for i in range(k, len(nums)):
        curr += nums[i]
        curr -= nums[i - k]
        ans = max(ans, curr)

    return ans

import pytest

@pytest.mark.parametrize(
    'nums, k, expected',
    [
        ([2, 1, 5, 1, 3, 2], 3, 9),      # [5,1,3]
        ([2, 3, 4, 1, 5], 2, 7),         # [3,4]
        ([1, 1, 1, 1, 1], 2, 2),         # all same
        ([5, 2, -1, 0, 3], 2, 7),        # [5,2]
        ([-2, -1, -3, -4], 2, -3),       # [-1,-2] or [-1,-3]
        ([10], 1, 10),                   # single element
        ([4, 2, 1, 7, 8, 1, 2, 8], 3, 16), # [7,8,1]
        ([1, 2, 3, 4, 5], 5, 15),        # whole array
    ]
)
def test_max_subarray_sum_of_size_k(nums, k, expected):
    assert max_sum_subarray_of_size_k(nums, k) == expected
