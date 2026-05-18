
# Two pointer with two iterables

# 1. Create two pointers, one for each iterable. Each pointer should start at the first index.
# 2. Use a while loop until one of the pointers reaches the end of its iterable.
# 3. At each iteration of the loop, move the pointers forward. This means incrementing either one of the pointers or both of the pointers.
#    Deciding which pointers to move will depend on the problem we are trying to solve.
# 4. Because our while loop will stop when one of the pointers reaches the end,
#    the other pointer will not be at the end of its respective iterable when the loop finishes.
#    Sometimes, we need to iterate through all elements -
#    if this is the case, you will need to write extra code here to make sure both iterables are exhausted.


def combine(arr1: list[int], arr2:list[int]) -> list[int]:
    ans = []

    n = len(arr1)
    m = len(arr2)

    pointer1 = 0
    pointer2 = 0

    while pointer1 < n and pointer2 < m :
        if arr1[pointer1] == arr2[pointer2]:
            ans.extend([arr1[pointer1], arr2[pointer2]])
            pointer1 += 1
            pointer2 += 1
        elif arr1[pointer1] < arr2[pointer2]:
            ans.append(arr1[pointer1])
            pointer1 += 1
        elif arr1[pointer1] > arr2[pointer2]:
            ans.append(arr2[pointer2])
            pointer2 += 1

    while pointer1 < n:
        ans.append(arr1[pointer1])
        pointer1 += 1

    while pointer2 < m:
        ans.append(arr2[pointer2])
        pointer2 += 1

    return ans

import pytest


@pytest.mark.parametrize("arr1, arr2, expected", [
    ([1, 6, 7], [4, 5, 6], [1, 4, 5, 6, 6, 7]),
    ([1, 2, 3], [4, 5, 6], [1, 2, 3, 4, 5, 6]),
    ([1, 3, 5], [2, 4, 6], [1, 2, 3, 4, 5, 6]),
    ([], [1, 2, 3], [1, 2, 3]),
    ([1, 2, 3], [], [1, 2, 3]),
])
def test_combine(arr1, arr2, expected):
    assert combine(arr1, arr2) == expected


if __name__ == "__main__":
    array1 = [1, 6, 7]
    array2 = [4, 5, 6]
    print(combine(array1, array2))





