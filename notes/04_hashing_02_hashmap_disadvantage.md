> The biggest disadvantage of hash maps is that for smaller input sizes, they can be slower due to overhead. Because big O ignores constants, the O(1). O(1) time complexity can sometimes be deceiving - it's usually something more like O(10) because every key needs to go through the hash function.

This paragraph is explaining an important limitation of hash maps.

They are saying:

> Even though hash maps are theoretically very fast (`O(1)`), in real life they still have some hidden work (overhead), especially for small datasets.

---

## What does this mean?

Big O notation ignores:

- constant costs
- implementation overhead
- actual machine operations

So both of these are considered:

```text id="i7h94k"
O(1)
```

But they are not equally fast.

---

## Example

### Array lookup

```javascript id="pqy6wn"
arr[5];
```

This is almost direct memory access.

Very little work happens.

---

### Hash map lookup

```javascript id="4d2je6"
map.get(5);
```

Internally, several things happen:

1. Run hash function on key
2. Convert hash to bucket/index
3. Handle collisions if needed
4. Compare keys
5. Return value

So although still "constant time", it has more operations.

---

## What they mean by:

> "it's usually something more like O(10)"

They do NOT literally mean mathematical `O(10)`.

They mean:

```text id="e3q14i"
There may be ~10 internal operations instead of 1.
```

Big O simplifies both as:

```text id="wy3m6t"
O(1)
```

because the number of operations does not grow with input size.

---

## Why this matters for small input sizes

Suppose you only have 5 items.

Using:

- array
- simple loop

may actually be faster than:

- hash map

because the overhead of hashing is larger than the dataset itself.

---

## Real-world analogy

### Array

Like going directly to house number 5 on a street.

---

### Hash map

Like:

1. asking a receptionist
2. checking a directory
3. mapping the name
4. then finding the room

Still fast, but more steps.

---

## Important takeaway

Big O tells you:

```text id="bsvzpp"
How performance grows as data becomes huge
```

It does NOT tell you:

- exact speed
- constant overhead
- cache efficiency
- memory cost

So:

- hash maps scale very well
- arrays can still be faster for tiny datasets

That’s exactly what the paragraph is trying to explain.
