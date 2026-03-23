# Example 2: Given a sorted array of unique integers and a target integer,
#   return true if there exists a pair of numbers that sum to target, false otherwise.
#   This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
#
# For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.

# Retried - 1
def sum_to_target(nums: list[int], target: int) -> tuple[int, int] | None:
    left = 0
    right = len(nums)-1

    while left < right:
        sum_of_two = nums[left] + nums[right]
        if sum_of_two == target:
            return (nums[left], nums[right])
        elif sum_of_two < target:
            left += 1
        else:
            right -= 1

    return None

if __name__ == "__main__":
    print(sum_to_target([1, 2, 4, 6, 8, 9, 14, 15], 23))
