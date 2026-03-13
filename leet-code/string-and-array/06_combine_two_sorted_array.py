
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

if __name__ == "__main__":
    array1 = [1, 6, 7]
    array2 = [4, 5, 6]
    print(combine(array1, array2))





