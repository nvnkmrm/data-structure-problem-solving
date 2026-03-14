
# Write a function that reverses a string. The input string is given as an array of characters s.
#
# You must do this by modifying the input array in-place with O(1) extra memory.
#
# Example 1:
#
# Input: s = ["h", "e", "l", "l", "o"]
# Output: ["o", "l", "l", "e", "h"]
#
# Example 2:
#
# Input: s = ["H", "a", "n", "n", "a", "h"]
# Output: ["h", "a", "n", "n", "a", "H"]


def reverse(s: list[str]) -> None:

    left = 0
    right= len(s) - 1

    while left < right:

        temp = s[left]
        s[left] = s[right]
        s[right] = temp

        left += 1
        right -= 1

    print("".join(s))


if __name__ == "__main__":
    s= "abcd"
    reverse(list(s))