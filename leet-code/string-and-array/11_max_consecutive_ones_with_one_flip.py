def max_consecutive_ones_with_one_flip(nums: str) -> int:
    left = 0
    curr = 0
    ans = 0

    for right in range(len(nums)):
        if nums[right] == '0':
            curr += 1

        while curr > 1:
            if nums[left] == '0':
                curr -= 1
            left += 1

        ans = max(ans, right - left + 1)

    return ans


import pytest


@pytest.mark.parametrize(
    'nums, expected',
    [
        ('11001111', 5),
        ('11001011', 4),
        ('1101', 4),
    ]
)
def test_max_consecutive_ones_with_one_flip(nums: str, expected: int):
    assert max_consecutive_ones_with_one_flip(nums) == expected
