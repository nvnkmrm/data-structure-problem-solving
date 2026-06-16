# find the longest subarray with a sum less than or equal to k

# nums = [1, 1, 1, 3] and k = 3.

# return 3 as 0,2 window is longest.

# function fn(arr):
#     left = 0
#     for (int right = 0; right < arr.length; right++):
#         Do some logic to "add" element at arr[right] to window
#
#         while WINDOW_IS_INVALID:
#             Do some logic to "remove" element at arr[left] from window
#             left++
#
#         Do some logic to update the answer

import pytest


# Retried - 2
def longest_subarray_with_sum_less_than_or_equal_to_k(nums: list[int], k: int) -> int:
    left = 0
    curr = 0
    ans = 0

    for right in range(len(nums)):
        curr += nums[right]
        while curr > k:
            curr -= nums[left]
            left += 1
        ans = max(ans, right - left + 1)
    return ans


@pytest.mark.parametrize("nums, k, expected", [
    ([1, 1, 1, 3], 3, 3),
    ([3, 2, 1, 3, 1, 1], 5, 3),
    ([1, 1, 1, 1, 4], 4, 4),
    ([1, 2, 3], 6, 3),
    ([5, 5, 5], 3, 0),
    ([5, 1, 1, 1], 3, 3),
])
def test_longest_subarray_with_sum_less_than_or_equal_to_k(nums, k, expected):
    assert longest_subarray_with_sum_less_than_or_equal_to_k(nums, k) == expected
    
    
#------------------------------------------------------------------------------------------------------------------------------
#------------------------------------------------------------------------------------------------------------------------------
#------------------------------------------------------------------------------------------------------------------------------

def longest_substring_atmost_k_zeros(nums: str, k: int) -> int:
    
    left = 0
    curr = 0
    ans = 0
    
    for right in range(len(nums)):
        if nums[right] == '0':
            curr+=1
            
        while curr > k:
            if nums[left] == '0':
                curr -= 1
            left += 1
        
        ans = max(ans, right - left + 1)
    
    return ans


@pytest.mark.parametrize(
    "nums, k, expected",
    [
        ("11001111", 1, 5),
        ("11001111", 2, 8),
        ("0000", 1, 1),
        ("0000", 2, 2),
        ("1111", 1, 4),
        ("1010101", 2, 5),
        ("1101001110", 2, 6),
        ("0", 1, 1),
        ("10", 0, 1),
        ("10001", 1, 2),
    ],
)
def test_longest_substring_atmost_k_zeros(nums: str, k: int, expected: int):
    assert longest_substring_atmost_k_zeros(nums, k) == expected