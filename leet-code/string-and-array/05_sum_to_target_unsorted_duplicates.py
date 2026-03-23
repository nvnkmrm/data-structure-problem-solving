# Example 1:
#
# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]
# Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
# Example 2:
#
# Input: nums = [3,2,4], target = 6
# Output: [1,2]
# Example 3:
#
# Input: nums = [3,3], target = 6
# Output: [0,1]
from typing import Any


# 1. Create an empty map.
# 2. Iterate through the array.
# 3. For each element num:
#       Calculate complement = target - num
#       If complement exists in the map → solution found.
#       Otherwise store num in the map with its index.

# Time Complexity: O(n)
# Space Complexity: O(n)

# Retried - 1
def sum_to_target(nums: list[int], target: int) -> list[int] | None:
    store = {}

    for i in range(len(nums)):

        balance = target - nums[i]

        if balance in store:
            return [store[balance], i]
        else:
            store[nums[i]] = i

    return None


if __name__ == '__main__':
    print(sum_to_target([1, 2, 3, 4, 5], 9))