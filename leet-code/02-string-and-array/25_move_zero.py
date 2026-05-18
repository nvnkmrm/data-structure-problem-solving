# Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
#
# Note that you must do this in-place without making a copy of the array.
#
# Example 1:
# Input: nums = [0,1,0,3,12]
# Output: [1,3,12,0,0]
# Example 2:
#
# Input: nums = [0]
# Output: [0]
#
# Constraints:
#
# 1 <= nums.length <= 104
# -231 <= nums[i] <= 231 - 1

def move_zeroes(nums: list[int]) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    zero_index = []
    j = 0

    for i in range(len(nums)):
        if nums[i] == 0:
            zero_index.append(i)
        elif j != len(zero_index):
            k = zero_index[j]
            temp = nums[i]
            nums[i] = nums[k]
            nums[k] = temp
            j+=1
            zero_index.append(i)


import pytest

@pytest.mark.parametrize(
    'nums, expected',
    [
        # Example cases
        ([0, 1, 0, 3, 12], [1, 3, 12, 0, 0]),
        ([0], [0]),

        # No zeroes
        ([1, 2, 3], [1, 2, 3]),

        # All zeroes
        ([0, 0, 0], [0, 0, 0]),

        # Zeroes at the beginning
        ([0, 0, 1, 2], [1, 2, 0, 0]),

        # Zeroes at the end
        ([1, 2, 0, 0], [1, 2, 0, 0]),

        # Mixed positions
        ([4, 0, 5, 0, 0, 3, 0, 1], [4, 5, 3, 1, 0, 0, 0, 0]),

        # Single non-zero
        ([7], [7]),

        # Negative numbers with zeroes
        ([0, -1, 0, -2, 3], [-1, -2, 3, 0, 0]),

        # Large values within constraints
        ([0, 10**9, 0, -10**9], [10**9, -10**9, 0, 0]),

        # Already in correct order
        ([1, 2, 3, 0, 0], [1, 2, 3, 0, 0]),

        # Alternating zeroes
        ([0, 1, 0, 2, 0, 3], [1, 2, 3, 0, 0, 0]),
    ]
)
def test_move_zeroes(nums: list[int], expected: list[int]):
    move_zeroes(nums)
    assert nums == expected