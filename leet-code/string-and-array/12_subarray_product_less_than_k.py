# Given an array of positive integers nums and an integer k,
# return the number of subarrays where the product of all the elements in the subarray is strictly less than k.

# For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8. The subarrays with products less than k are:

# [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]

def subarray_product_less_than_k(nums: list[int], k) -> int:
    if k <= 0:
        return 0

    left = 0
    ans = 0
    curr = 1

    for right in range(len(nums)):
        curr *= nums[right]

        while curr >= k:
            curr //= nums[left]
            left += 1

        ans += right - left + 1

    return ans

import pytest

@pytest.mark.parametrize(
    'nums, k, expected',
    [
        ([10, 5, 2, 6], 100, 8),   # given example
        ([1, 2, 3], 0, 0),         # k = 0 → no valid subarrays
        ([1, 1, 1], 2, 6),         # all subarrays valid
        ([1, 2, 3], 7, 6),         # all subarrays valid
        ([10, 5, 2, 6], 10, 3),    # only small subarrays
        ([5], 10, 1),              # single element valid
        ([5], 5, 0),               # equal to k → not allowed
        ([2, 3, 4], 50, 6),        # mix of combinations
        ([100, 200], 50, 0),       # all elements greater than k
        ([1, 2, 3, 4], 10, 7),     # mixed valid subarrays
    ]
)
def test_num_subarray_product_less_than_k(nums: list[int], k: int, expected: int):
    assert subarray_product_less_than_k(nums, k) == expected
