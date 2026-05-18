
# You are given an integer array nums consisting of n elements, and an integer k.
#
# Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
# Any answer with a calculation error less than 10-5 will be accepted.
#
# Example 1:
#
# Input: nums = [1, 12, -5, -6, 50, 3], k = 4
# Output: 12.75000
# Explanation: Maximum
# average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

# Example 2:
#
# Input: nums = [5], k = 1
# Output: 5.00000

def max_average_subarray_of_size_k(nums: list[int], k: int) -> int:
    curr = 0
    for i in range(k):
        curr += nums[i]

    ans = curr/k

    for i in range(k, len(nums)):

        curr -= nums[i-k]
        curr += nums[i]

        ans = max(ans, curr/k)

    return ans


import pytest

@pytest.mark.parametrize(
    'nums, k, expected',
    [
        ([1, 12, -5, -6, 50, 3], 4, 12.75),   # typical case
        ([5], 1, 5.0),                        # single element
        ([0, 0, 0, 0], 2, 0.0),               # all zeros
        ([4, 2, 1, 3, 3], 2, 3.0),            # multiple valid subarrays
        ([-1, -2, -3, -4], 2, -1.5),          # all negative numbers
        ([10, -10, 10, -10, 10], 1, 10.0),    # k = 1 (max element)
        ([7, 7, 7, 7, 7], 3, 7.0),            # identical values
        ([1, 2, 3, 4, 5], 5, 3.0),            # k = len(nums)
    ]
)
def test_max_average_subarray(nums, k, expected):
    assert abs(max_average_subarray_of_size_k(nums, k) - expected) < 1e-5