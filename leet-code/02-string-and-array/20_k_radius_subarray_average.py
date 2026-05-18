# You are given a 0-indexed array nums of n integers, and an integer k.
#
# The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements
# in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i,
# then the k-radius average is -1.
#
# Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.
#
# The average of x elements is the sum of the x elements divided by x, using integer division.
# The integer division truncates toward zero, which means losing its fractional part.
#
# For example, the average of four elements 2, 3, 1, and 5 is (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75, which truncates to 2.
#
#
# Input: nums = [7,4,3,9,1,8,5,2,6], k = 3
# Output: [-1,-1,-1,5,4,4,-1,-1,-1]
# Explanation:
# - avg[0], avg[1], and avg[2] are -1 because there are less than k elements before each index.
# - The sum of the subarray centered at index 3 with radius 3 is: 7 + 4 + 3 + 9 + 1 + 8 + 5 = 37.
#   Using integer division, avg[3] = 37 / 7 = 5.
# - For the subarray centered at index 4, avg[4] = (4 + 3 + 9 + 1 + 8 + 5 + 2) / 7 = 4.
# - For the subarray centered at index 5, avg[5] = (3 + 9 + 1 + 8 + 5 + 2 + 6) / 7 = 4.
# - avg[6], avg[7], and avg[8] are -1 because there are less than k elements after each index.
#
# Input: nums = [100000], k = 0
# Output: [100000]
# Explanation:
# - The sum of the subarray centered at index 0 with radius 0 is: 100000.
#   avg[0] = 100000 / 1 = 100000.
#
#
# Input: nums = [8], k = 100000
# Output: [-1]
# Explanation:
# - avg[0] is -1 because there are less than k elements before and after index 0.


import math

def k_radius_subarray_average(nums: list[int], k: int) -> list[int]:

    prefix = [nums[0]]
    ans = []
    last_index = len(nums) - 1

    for i in range(1, len(nums)):
        prefix.append(nums[i] + prefix[ i -1])

    for i in range(len(nums)):

        right = i + k
        left = i - k

        if left < 0 or right > last_index:
            ans.append(-1)
            continue

        average = math.floor((prefix[right] - prefix[left] + nums[left]) / (( k *2) + 1))
        ans.append(average)

    return ans

import pytest

@pytest.mark.parametrize(
    'nums, k, expected',
    [
        # Given examples
        ([7,4,3,9,1,8,5,2,6], 3, [-1,-1,-1,5,4,4,-1,-1,-1]),
        ([100000], 0, [100000]),
        ([8], 100000, [-1]),

        # Edge cases
        ([1,2,3,4,5], 1, [-1,2,3,4,-1]),  # simple radius 1
        ([1,2,3,4,5], 2, [-1,-1,3,-1,-1]),  # only one valid center
        ([1,2,3,4,5], 3, [-1,-1,-1,-1,-1]),  # no valid centers

        # All same values
        ([5,5,5,5,5], 1, [-1,5,5,5,-1]),

        # Larger window
        ([10,20,30,40,50,60,70], 2, [-1,-1,30,40,50,-1,-1]),

        # k = 0 (should return same array)
        ([1,2,3], 0, [1,2,3]),

        # Negative numbers
        ([-3,-2,-1,0,1,2,3], 1, [-1,-2,-1,0,1,2,-1]),

        # Mixed values
        ([1,3,2,6,-1,4,1,8,2], 2, [-1,-1,2,2,2,3,2,-1,-1]),

        # Minimum valid window
        ([2,4,6], 1, [-1,4,-1]),
    ]
)
def test_k_radius_subarray_average(nums: list[int], k: int, expected: list[int]):
    assert k_radius_subarray_average(nums, k) == expected