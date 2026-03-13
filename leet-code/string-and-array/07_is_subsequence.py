# Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
#
# A subsequence of a string is a new string that is formed from the original string by
# deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
# (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
#
# Example 1:
#
# Input: s = "abc", t = "ahbgdc"
# Output: true
# Example 2:
#
# Input: s = "axc", t = "ahbgdc"
# Output: false

def is_subsequence(str1, str2):
    pointer = 0

    for i in range(len(str2)):
        if pointer < len(str1) and str1[pointer] == str2[i]:
            pointer += 1

    if pointer == len(str1):
        return True

    return False

if __name__ == "__main__":
    print(is_subsequence("ax", "abczxc"))