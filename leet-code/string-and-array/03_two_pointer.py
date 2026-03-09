
# Two Pointer Approach
# 1. Start one pointer at the first index 0 and the other pointer at the last index input.length - 1.
# 2. Use a while loop until the pointers are equal to each other.
# 3. At each iteration of the loop, move the pointers towards each other.
#    This means either increment the pointer that started at the first index, decrement the pointer that started at the last index, or both.
#    Deciding which pointers to move will depend on the problem we are trying to solve.

# function fn(arr):
#     left = 0
#     right = arr.length - 1
#
#     while left < right:
#         Do some logic here depending on the problem
#         Do some more logic here to decide on one of the following:
#             1. left++
#             2. right--
#             3. Both left++ and right--

def palindrome(s : str) -> bool:
    i = 0
    j = len(s)-1

    while i < j:
        if s[i] != s[j]:
            return False
        i += 1
        j -= 1

    return True


if __name__ == "__main__":
    print(palindrome("abc"))
    print(palindrome("aba"))
    print(palindrome("racecar"))
    print(palindrome("abcdcba"))