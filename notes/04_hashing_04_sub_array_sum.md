## Problem

Find the number of subarrays whose sum is exactly `k`.

Example:

```python
nums = [0, 1, 2, 3, 4]
k = 5
```

Answer:

```python
1
```

because only:

```python
[2, 3]
```

has sum `5`.

---

## Final Algorithm

```python
from collections import defaultdict

def no_of_subarrays(nums: list[int], k: int) -> int:
    prefix_map = defaultdict(int)

    # Empty prefix sum
    prefix_map[0] = 1

    curr_sum = 0
    count = 0

    for num in nums:
        curr_sum += num

        count += prefix_map[curr_sum - k]

        prefix_map[curr_sum] += 1

    return count
```

---

## Core Idea

If:

```text
prefix[j] = sum(nums[0..j])
prefix[i] = sum(nums[0..i])
```

then:

```text
sum(nums[i+1..j]) = prefix[j] - prefix[i]
```

We want:

```text
sum(nums[i+1..j]) = k
```

Therefore:

```text
prefix[j] - prefix[i] = k
prefix[i] = prefix[j] - k
```

At every index:

```python
curr_sum = prefix[j]
```

we ask:

> How many earlier prefix sums equal `curr_sum - k`?

Each such prefix sum creates one valid subarray ending at the current index.

This is exactly what this line does:

```python
count += prefix_map[curr_sum - k]
```

---

## Why `curr_sum - k`?

Suppose:

```python
curr_sum = 10
k = 5
```

We need:

```text
10 - previous_prefix = 5
```

Therefore:

```text
previous_prefix = 5
```

So we look for:

```python
prefix_map[5]
```

---

## Why do we need `prefix_map[0] = 1`?

This represents the **empty prefix sum**:

```text
sum of zero elements before the array starts = 0
```

Without it, we would miss subarrays that start at index `0`.

Example:

```python
nums = [2, 3]
k = 5
```

When:

```python
curr_sum = 5
```

we need:

```python
curr_sum - k = 0
```

The empty prefix sum provides that match.

---

## Why use a dictionary instead of a set?

A set only answers:

> Have I seen this prefix sum before?

The algorithm needs:

> How many times have I seen this prefix sum before?

because each occurrence corresponds to a different subarray.

Therefore we store:

```text
prefix_sum -> frequency
```

instead of:

```text
prefix_sum -> exists?
```

---

## Example where frequency matters

```python
nums = [0, 0, 0]
k = 0
```

Valid subarrays:

```text
[0]
[0]
[0]
[0,0]
[0,0]
[0,0,0]
```

Total:

```text
6
```

Using frequencies:

```text
1 + 2 + 3 = 6
```

Using a set:

```text
1 + 1 + 1 = 3
```

which is incorrect.

---

## Detailed Example

```python
nums = [1, -1, 1, -1]
k = 0
```

### Prefix sums

Including empty prefix:

```text
0, 1, 0, 1, 0
```

Frequency map at the end:

```python
{
    0: 3,
    1: 2
}
```

---

### Iteration

| Index | Num | curr_sum | curr_sum-k | prefix_map[curr_sum-k] | count |
| ----- | --- | -------- | ---------- | ---------------------- | ----- |
| Start | -   | 0        | -          | `{0:1}`                | 0     |
| 0     | 1   | 1        | 1          | 0                      | 0     |
| 1     | -1  | 0        | 0          | 1                      | 1     |
| 2     | 1   | 1        | 1          | 1                      | 2     |
| 3     | -1  | 0        | 0          | 2                      | 4     |

Final answer:

```python
4
```

---

## Which subarrays are found?

```text
[1, -1]           indices 0..1
[-1, 1]           indices 1..2
[1, -1]           indices 2..3
[1, -1, 1, -1]    indices 0..3
```

---

## Meaning of

```python
count += prefix_map[curr_sum - k]
```

This means:

> Count how many earlier positions exist such that removing everything before them leaves a subarray with sum `k`.

Mathematically:

```text
curr_sum - previous_prefix = k
```

Rearranging:

```text
previous_prefix = curr_sum - k
```

Every occurrence of that earlier prefix sum corresponds to one valid subarray ending at the current index.

---

## Mental Model

Think of prefix sums as checkpoints:

```text
0 ----1----0----1----0
```

When you're standing at the current checkpoint and want a subarray sum of `k`, ask:

> How many earlier checkpoints are exactly `k` behind me?

For `k = 0`, that becomes:

> How many earlier checkpoints have the same value as mine?

Each matching checkpoint defines one valid subarray.

That is the entire prefix sum + hashmap technique in one sentence.
