# There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
# The biker starts his trip on point 0 with altitude equal 0.
#
# You are given an integer array gain of length n where gain[i] is the net gain in altitude
# between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
#
# Example 1:
#
# Input: gain = [-5,1,5,0,-7]
# Output: 1
# Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
# Example 2:
#
# Input: gain = [-4,-3,-2,-1,4,3,2]
# Output: 0
# Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
#
# Constraints:
#
# n == gain.length
# 1 <= n <= 100
# -100 <= gain[i] <= 100

def largest_altitude(gain: list[int]) -> int:
    prefix = [0, gain[0]]
    max_gain = max(0, gain[0])

    for i in range(1, len(gain)):
        prefix_sum = prefix[i] + gain[i]
        prefix.append(prefix_sum)

        max_gain = max(max_gain, prefix_sum)

    return max_gain

import pytest

@pytest.mark.parametrize(
    'gain, expected',
    [
        # Example cases
        ([-5, 1, 5, 0, -7], 1),
        ([-4, -3, -2, -1, 4, 3, 2], 0),

        # Single element cases
        ([10], 10),        # 0 -> 10
        ([-10], 0),        # 0 -> -10 (max is 0)

        # All positive gains
        ([1, 2, 3, 4], 10),   # cumulative: 0,1,3,6,10

        # All negative gains
        ([-1, -2, -3, -4], 0),

        # Mixed values
        ([3, -2, 5, -1], 6),   # 0,3,1,6,5 -> max = 6
        ([-2, 3, -1, 2], 2),   # 0,-2,1,0,2 -> max = 2? ❌ careful → max = 2

        # Corrected above case
        ([-2, 3, -1, 2], 2),

        # Edge case: alternating gains
        ([1, -1, 1, -1, 1], 1),

        # Edge case: max constraint values
        ([100] * 100, 10000),   # cumulative sum grows to 10000

        # Edge case: minimum constraint values
        ([-100] * 100, 0),

        # Peaks in middle
        ([5, -3, 4, -2, 1], 6),  # 0,5,2,6,4,5 -> max = 6

        # Peak at start
        ([7, -10, 2, 3], 7),

        # Peak at end
        ([-3, -2, 1, 10], 6),   # 0,-3,-5,-4,6 -> max = 6
    ]
)
def test_largest_altitude(gain: list[int], expected: int):
    assert largest_altitude(gain) == expected