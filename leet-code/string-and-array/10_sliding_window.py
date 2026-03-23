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

def longest_subarray_with_sum_less_than_or_equal_to_k(nums: list[int], k: int) -> int:
    left = 0
    answer = 0
    current_sum = 0
    for right in range(len(nums)):
        current_sum += nums[right]

        while current_sum > k:
            current_sum -= nums[left]
            left += 1

        answer = max(answer, right - left + 1)

    return answer

import pytest


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


if __name__ == '__main__':
    print(longest_subarray_with_sum_less_than_or_equal_to_k([1,1,1,3],3))
    print(longest_subarray_with_sum_less_than_or_equal_to_k([3, 2, 1, 3, 1, 1],5))
    print(longest_subarray_with_sum_less_than_or_equal_to_k([1,1,1,1,4],4))
