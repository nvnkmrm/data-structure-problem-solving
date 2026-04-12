# Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer
# common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
#
# Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one
# occurrence of that integer.
#
# Example 1:
#
# Input: nums1 = [1,2,3], nums2 = [2,4]
# Output: 2
# Explanation: The smallest element common to both arrays is 2, so we return 2.
# Example 2:
#
# Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
# Output: 2
# Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
#
# Constraints:
#
# 1 <= nums1.length, nums2.length <= 105
# 1 <= nums1[i], nums2[j] <= 109
# Both nums1 and nums2 are sorted in non-decreasing order.


def get_common(nums1: list[int], nums2: list[int]) -> int:
    i = j = 0

    while i < len(nums1) and j < len(nums2):
        if nums1[i] == nums2[j]:
            return nums1[i]
        
        if nums1[i] < nums2[j]:
            i+=1
        else: 
            j+=1

    return -1

import pytest

import pytest

@pytest.mark.parametrize(
    'nums1, nums2, expected',
    [
        # Basic cases
        ([1, 2, 3], [2, 4], 2),
        ([1, 2, 3, 6], [2, 3, 4, 5], 2),

        # No common element
        ([1, 3, 5], [2, 4, 6], -1),

        # Single element arrays - common
        ([5], [5], 5),

        # Single element arrays - no common
        ([5], [6], -1),

        # Multiple common elements, return smallest
        ([1, 2, 2, 3], [2, 2, 4], 2),

        # Duplicates in both arrays
        ([1, 1, 2, 2, 3], [2, 2, 2, 3, 3], 2),

        # Common element at the beginning
        ([1, 2, 3], [1, 4, 5], 1),

        # Common element at the end
        ([1, 3, 5, 7], [2, 4, 6, 7], 7),

        # Large values within constraints
        ([10**9 - 2, 10**9 - 1, 10**9], [10**9], 10**9),

        # One array is subset of another
        ([1, 2, 3, 4], [2, 3], 2),

        # Identical arrays
        ([1, 2, 3], [1, 2, 3], 1),

        # Edge: minimum values
        ([1, 1, 1], [1], 1),

        # Edge: large size pattern (simulated small version)
        (list(range(1, 100)), list(range(50, 150)), 50),
    ]
)
def test_get_common(nums1: list[int], nums2: list[int], expected: int):
    assert get_common(nums1, nums2) == expected