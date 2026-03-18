# Table of Contents

- [Arrays and strings](#arrays-and-strings)
  - [Strings are Immutable](#strings-are-immutable)
  - [Why Array and String are Ordered Group of Elements](#why-array-and-string-are-ordered-group-of-elements)
  - [Appending to the end of a list is amortized O(1)](#appending-to-the-end-of-a-list-is-amortized-o1)
  - [Why Sliding Window is O(n)](#why-sliding-window-is-on)
  - [Total Number of Subarrays in an Array](#total-number-of-subarrays-in-an-array)

---

# Arrays and strings

## Strings are Immutable

In Python, **strings are immutable**.

That means once a string is created, **you cannot change its content in place**.

### Example

```python
s = "hello"
s[0] = "H"   # ❌ This will raise an error
```

You’ll get:

```
TypeError: 'str' object does not support item assignment
```

---

### What you do instead

You create a **new string**:

```python
s = "hello"
s = "H" + s[1:]
print(s)  # "Hello"
```

### Why strings are immutable

- Memory efficiency (can reuse objects)
- Safer (no accidental modification)
- Faster in many internal operations (like hashing for dictionaries)

### Key takeaway

- **Mutable** → can change (e.g., `list`, `dict`)
- **Immutable** → cannot change (e.g., `str`, `tuple`, `int`)

When people say **arrays (1D) and strings are very similar in algorithm problems**, they mean that **both are ordered sequences of elements**, so many algorithms work on them in the same way.

Let's break it down.

---

## Why Array and String are Ordered Group of Elements

### 1. Ordered Group of Elements

An **ordered group** means the elements have a **fixed position (index)**.

Example:

Array:

```
[10, 20, 30, 40]
 0   1   2   3
```

String:

```
"CODE"
 0 1 2 3
```

Both:

- Have **indexes**
- Can access elements using index
- Maintain **order**

Example operations:

```
arr[2] → 30
str[2] → 'D'
```

So algorithmically, they behave similarly.

---

### 2. Both Allow Traversal

You usually solve problems by **iterating through elements**.

Example:

Array

```python
for i in range(len(arr)):
    print(arr[i])
```

String

```python
for i in range(len(s)):
    print(s[i])
```

Same pattern.

---

### 3. Many Algorithms Work on Both

Common algorithm techniques apply to **both arrays and strings**:

| Technique      | Example (Array)      | Example (String)        |
| -------------- | -------------------- | ----------------------- |
| Traversal      | find max element     | count vowels            |
| Two pointers   | pair sum             | palindrome check        |
| Sliding window | subarray sum         | longest substring       |
| Hashing        | frequency of numbers | frequency of characters |

Example:

Palindrome check:

```
s = "madam"
```

Using two pointers:

```
left = 0
right = len(s) - 1
```

Same technique can be used on an array.

---

### 4. The Only Major Difference

| Array                  | String                                 |
| ---------------------- | -------------------------------------- |
| stores numbers/objects | stores characters                      |
| usually mutable        | usually immutable (Python, Java, etc.) |

Example in Python:

```
arr[0] = 100   ✅ allowed
s[0] = 'A'     ❌ not allowed
```

But **algorithmically they are still treated similarly**.

---

✅ **Simple definition**

> Arrays and strings are both **ordered collections of elements that can be accessed by index**, so many algorithm techniques apply to both.

---

## Appending to the end of a list is amortized O(1)

When someone says **“Appending to the end of a list is amortized O(1)”**, they mean:

> On **average**, adding an element to the end of a list takes **constant time**, even though **some individual operations may take longer**.

Let’s break it down.

---

### 1. Normal Append (O(1))

In languages like **Python**, when you do:

```python
arr = []
arr.append(10)
arr.append(20)
```

The list internally has **extra unused capacity**.

Example internal structure:

```
Capacity: 8
Size: 3
[1, 2, 3, _, _, _, _, _]
```

If there is **free space**, the element is simply placed at the next index.

```
[1, 2, 3, 4, _, _, _, _]
```

This operation takes **constant time → O(1)**.

---

### 2. When the List Becomes Full

Sometimes the list **runs out of space**.

Example:

```
Capacity: 4
Size: 4
[1,2,3,4]
```

If we append:

```python
arr.append(5)
```

The system must:

1. Allocate a **larger array** (usually 2× size)
2. Copy all elements
3. Add the new element

Example:

```
Old: [1,2,3,4]
New: [1,2,3,4,5,_,_,_]
```

This step costs **O(n)** because all elements are copied.

---

### 3. Why It Is Still “Amortized O(1)”

The expensive **resize operation happens rarely**.

Example sequence of appends:

| Operation         | Cost |
| ----------------- | ---- |
| append 1          | O(1) |
| append 2          | O(1) |
| append 3          | O(1) |
| append 4          | O(1) |
| append 5 (resize) | O(n) |
| append 6          | O(1) |
| append 7          | O(1) |

If you append **1000 elements**, resizing may happen **only ~10 times**.

So the **total cost spread over all operations** becomes:

$$
\text{Average cost per append} = O(1)
$$

This is called **amortized analysis**.

---

### 4. Simple Analogy

Think of a **notebook**.

- Writing on the next page → **fast**
- When notebook is full → **buy a new bigger notebook and copy notes**

Buying happens **rarely**, so **average writing time per note is still constant**.

---

✅ **Final meaning**

> **Appending to a list is amortized O(1)** means that although **some appends take O(n)** due to resizing, **the average time per append across many operations is constant**.

---

If you'd like, I can also show a **visual step-by-step memory growth of a Python list (0 → 1 → 2 → 4 → 8 → 16)** which makes this concept extremely clear for algorithm interviews.

## Why Sliding Window is O(n)

Why It Is Still O(n) Even With Two Pointers

Many sliding window algorithms use two pointers:

left = 0
for right in range(n):
while window_invalid:
left += 1

At first glance it looks like nested loops, but actually:

right moves n times

left also moves at most n times

So total pointer movements:

right pointer -> n
left pointer -> n
Total -> 2n

Big-O ignores constants:

O(2n) → O(n)

## Total Number of Subarrays in an Array

For an array of length **n**, the total number of subarrays is:

```
n * (n + 1) / 2
```

---

### Explanation

A subarray is a **contiguous part of an array**.

For an array of length **n**:

```
Length 1 subarrays → n
Length 2 subarrays → n - 1
Length 3 subarrays → n - 2
...
Length n subarrays → 1
```

Total:

```
n + (n - 1) + (n - 2) + ... + 1
```

This is the **sum of the first n natural numbers**, which equals:

```
n * (n + 1) / 2
```

---

### Example

Array:

```
[1, 2, 3]
```

Subarrays:

```
[1]
[2]
[3]
[1,2]
[2,3]
[1,2,3]
```

Total:

```
3 * (3 + 1) / 2 = 6
```
