# ============================================================
# Python List Operations - Comprehensive Reference
# ============================================================

lst = [1, 2, 3, 4, 5]

# ─────────────────────────────────────────────
# 1. CREATION
# ─────────────────────────────────────────────
l1 = []                          # empty list
l2 = [1, 2, 3]                   # integer list
l3 = ["a", "b", "c"]             # string list
l4 = [1, "hello", 3.14, True]    # mixed types
l5 = list()                      # empty via constructor
l6 = list("abc")                 # ['a', 'b', 'c']
l7 = list(range(5))              # [0, 1, 2, 3, 4]
l8 = list(range(1, 10, 2))       # [1, 3, 5, 7, 9]
l9 = [0] * 5                     # [0, 0, 0, 0, 0]  (repeat)
l10 = [[0] * 3 for _ in range(3)]# 3×3 matrix (safe nested)

# ─────────────────────────────────────────────
# 2. ACCESSING ELEMENTS & SLICING
# ─────────────────────────────────────────────
lst = [10, 20, 30, 40, 50]

first   = lst[0]          # 10
last    = lst[-1]         # 50
third   = lst[2]          # 30

sl1     = lst[1:4]        # [20, 30, 40]   (start:stop, stop exclusive)
sl2     = lst[:3]         # [10, 20, 30]
sl3     = lst[2:]         # [30, 40, 50]
sl4     = lst[::2]        # [10, 30, 50]   (every 2nd)
sl5     = lst[::-1]       # [50, 40, 30, 20, 10]  (reversed copy)
sl6     = lst[1:4:2]      # [20, 40]       (start:stop:step)

# ─────────────────────────────────────────────
# 3. BASIC PROPERTIES
# ─────────────────────────────────────────────
lst = [3, 1, 4, 1, 5, 9, 2, 6]

length  = len(lst)              # 8
minimum = min(lst)              # 1
maximum = max(lst)              # 9
total   = sum(lst)              # 31
empty   = len([]) == 0          # True

# ─────────────────────────────────────────────
# 4. ADDING ELEMENTS
# ─────────────────────────────────────────────
lst = [1, 2, 3]

lst.append(4)              # [1, 2, 3, 4]          — add single item to end  O(1)
lst.insert(1, 99)          # [1, 99, 2, 3, 4]      — insert at index         O(n)
lst.extend([5, 6])         # [1, 99, 2, 3, 4, 5, 6]— add all items from iterable O(k)
lst += [7, 8]              # [1, 99, 2, 3, 4, 5, 6, 7, 8]  (same as extend)
lst = lst + [9]            # creates a NEW list (concatenation)

# ─────────────────────────────────────────────
# 5. REMOVING ELEMENTS
# ─────────────────────────────────────────────
lst = [1, 2, 3, 2, 4]

lst.remove(2)              # [1, 3, 2, 4]   — removes FIRST occurrence; raises ValueError if missing
popped  = lst.pop()        # removes & returns last element  → 4,  lst = [1, 3, 2]
popped2 = lst.pop(0)       # removes & returns element at index 0 → 1, lst = [3, 2]
lst.clear()                # []             — removes all elements

lst = [10, 20, 30, 40]
del lst[1]                 # [10, 30, 40]   — delete by index
del lst[0:2]               # [40]           — delete slice

# ─────────────────────────────────────────────
# 6. SEARCHING & COUNTING
# ─────────────────────────────────────────────
lst = [1, 2, 3, 2, 1]

idx     = lst.index(2)          # 1   — first occurrence; raises ValueError if missing
idx2    = lst.index(2, 2)       # 3   — search starting from index 2
cnt     = lst.count(2)          # 2   — number of times 2 appears
found   = 3 in lst              # True
missing = 9 not in lst          # True

# ─────────────────────────────────────────────
# 7. SORTING
# ─────────────────────────────────────────────
lst = [3, 1, 4, 1, 5, 9, 2, 6]

lst.sort()                    # [1, 1, 2, 3, 4, 5, 6, 9]  — in-place, ascending
lst.sort(reverse=True)        # [9, 6, 5, 4, 3, 2, 1, 1]  — in-place, descending
lst.sort(key=lambda x: -x)    # sort by custom key (descending via negation)

words = ["banana", "apple", "cherry"]
words.sort(key=len)           # ['apple', 'banana', 'cherry']  — sort by length

sorted_asc  = sorted(lst)                  # NEW list, ascending
sorted_desc = sorted(lst, reverse=True)    # NEW list, descending
sorted_key  = sorted(words, key=str.lower) # case-insensitive sort

# sort list of tuples by second element
pairs = [(1, 3), (2, 1), (3, 2)]
pairs.sort(key=lambda x: x[1])  # [(2, 1), (3, 2), (1, 3)]

# ─────────────────────────────────────────────
# 8. REVERSING
# ─────────────────────────────────────────────
lst = [1, 2, 3, 4, 5]

lst.reverse()              # [5, 4, 3, 2, 1]   — in-place
rev_copy = lst[::-1]       # new reversed list
rev_iter = list(reversed(lst))  # new list via reversed()

# ─────────────────────────────────────────────
# 9. COPYING
# ─────────────────────────────────────────────
lst = [1, 2, [3, 4]]

shallow1 = lst.copy()          # shallow copy — nested objects are shared
shallow2 = lst[:]              # shallow copy via slice
shallow3 = list(lst)           # shallow copy via constructor

import copy
deep = copy.deepcopy(lst)      # deep copy — fully independent, including nested

# ─────────────────────────────────────────────
# 10. MODIFYING IN PLACE (SLICE ASSIGNMENT)
# ─────────────────────────────────────────────
lst = [1, 2, 3, 4, 5]

lst[1]    = 99              # [1, 99, 3, 4, 5]   — update single element
lst[1:3]  = [20, 30]        # [1, 20, 30, 4, 5]  — replace slice
lst[1:3]  = [7, 8, 9]       # [1, 7, 8, 9, 4, 5] — replace with different length
lst[2:4]  = []              # [1, 7, 4, 5]        — delete slice via empty assignment
lst[1:1]  = [100, 200]      # [1, 100, 200, 7, 4, 5]  — insert without removing

# ─────────────────────────────────────────────
# 11. LIST COMPREHENSIONS
# ─────────────────────────────────────────────
squares      = [x**2 for x in range(6)]                  # [0, 1, 4, 9, 16, 25]
evens        = [x for x in range(10) if x % 2 == 0]      # [0, 2, 4, 6, 8]
nested_flat  = [x for row in [[1,2],[3,4]] for x in row] # [1, 2, 3, 4]
cond_expr    = [x if x > 0 else 0 for x in [-1, 2, -3, 4]] # [0, 2, 0, 4]
matrix       = [[i * j for j in range(1, 4)] for i in range(1, 4)]
# [[1,2,3],[2,4,6],[3,6,9]]

# ─────────────────────────────────────────────
# 12. AGGREGATION & FUNCTIONAL TOOLS
# ─────────────────────────────────────────────
from functools import reduce

nums = [1, 2, 3, 4, 5]

total    = sum(nums)                         # 15
product  = reduce(lambda a, b: a * b, nums)  # 120
mapped   = list(map(lambda x: x**2, nums))  # [1, 4, 9, 16, 25]
filtered = list(filter(lambda x: x > 2, nums)) # [3, 4, 5]
zipped   = list(zip([1, 2, 3], ["a", "b", "c"])) # [(1,'a'),(2,'b'),(3,'c')]
any_pos  = any(x > 4 for x in nums)         # True
all_pos  = all(x > 0 for x in nums)         # True

# ─────────────────────────────────────────────
# 13. ITERATION
# ─────────────────────────────────────────────
lst = ["a", "b", "c"]

# basic
for item in lst:
    pass                             # item → 'a', 'b', 'c'

# with index
for i, item in enumerate(lst):
    pass                             # (0,'a'), (1,'b'), (2,'c')

# with index starting at custom value
for i, item in enumerate(lst, start=1):
    pass                             # (1,'a'), (2,'b'), (3,'c')

# iterate two lists together
for a, b in zip([1, 2, 3], [4, 5, 6]):
    pass                             # (1,4), (2,5), (3,6)

# iterate in reverse
for item in reversed(lst):
    pass                             # 'c', 'b', 'a'

# ─────────────────────────────────────────────
# 14. CONCATENATION & REPETITION
# ─────────────────────────────────────────────
a = [1, 2]
b = [3, 4]

concat  = a + b          # [1, 2, 3, 4]   — new list
repeat  = a * 3          # [1, 2, 1, 2, 1, 2]   — new list
a += b                   # [1, 2, 3, 4]   — in-place extend (no new list)

# ─────────────────────────────────────────────
# 15. MEMBERSHIP & COMPARISON
# ─────────────────────────────────────────────
lst = [1, 2, 3]

in_test  = 2 in lst          # True
not_in   = 5 not in lst      # True
eq       = [1, 2] == [1, 2]  # True  (element-wise)
neq      = [1, 2] != [1, 3]  # True
lt       = [1, 2] < [1, 3]   # True  (lexicographic)
gt       = [2, 0] > [1, 9]   # True

# ─────────────────────────────────────────────
# 16. STACKING AS STACK (LIFO)
# ─────────────────────────────────────────────
stack = []
stack.append(1)    # push
stack.append(2)
stack.append(3)
top = stack[-1]    # peek  → 3
val = stack.pop()  # pop   → 3

# ─────────────────────────────────────────────
# 17. USING AS QUEUE (FIFO) — prefer collections.deque
# ─────────────────────────────────────────────
from collections import deque

queue = deque()
queue.append(1)     # enqueue right
queue.append(2)
queue.append(3)
front = queue[0]            # peek front → 1
val   = queue.popleft()     # dequeue left → 1

# appendleft / appendright for double-ended ops
queue.appendleft(0)         # deque([0, 2, 3])
queue.pop()                 # removes from right

# ─────────────────────────────────────────────
# 18. 2D LIST (MATRIX) OPERATIONS
# ─────────────────────────────────────────────
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
]

elem    = matrix[1][2]                              # 6
row1    = matrix[0]                                 # [1, 2, 3]
col1    = [row[0] for row in matrix]               # [1, 4, 7]
flat    = [x for row in matrix for x in row]       # [1,2,3,4,5,6,7,8,9]
transposed = [[row[i] for row in matrix] for i in range(len(matrix[0]))]
# [[1,4,7],[2,5,8],[3,6,9]]

# ─────────────────────────────────────────────
# 19. FLATTENING
# ─────────────────────────────────────────────
nested = [[1, 2], [3, 4], [5]]

flat1 = [x for sub in nested for x in sub]    # [1, 2, 3, 4, 5]

import itertools
flat2 = list(itertools.chain.from_iterable(nested))  # [1, 2, 3, 4, 5]

# deep flatten (arbitrary nesting)
def deep_flatten(lst):
    result = []
    for item in lst:
        if isinstance(item, list):
            result.extend(deep_flatten(item))
        else:
            result.append(item)
    return result

deep_flat = deep_flatten([1, [2, [3, [4]], 5]])  # [1, 2, 3, 4, 5]

# ─────────────────────────────────────────────
# 20. REMOVING DUPLICATES (preserve order)
# ─────────────────────────────────────────────
lst = [3, 1, 4, 1, 5, 9, 2, 6, 5]

uniq_set      = list(set(lst))                      # order NOT guaranteed
uniq_ordered  = list(dict.fromkeys(lst))             # [3, 1, 4, 5, 9, 2, 6]  (order kept)

# ─────────────────────────────────────────────
# 21. FINDING MIN / MAX WITH INDEX
# ─────────────────────────────────────────────
lst = [3, 1, 4, 1, 5, 9, 2, 6]

min_val   = min(lst)                          # 1
max_val   = max(lst)                          # 9
min_idx   = lst.index(min(lst))              # 1
max_idx   = lst.index(max(lst))              # 5

# using key
words = ["banana", "apple", "cherry"]
longest  = max(words, key=len)               # 'cherry'
shortest = min(words, key=len)               # 'apple'

# ─────────────────────────────────────────────
# 22. PARTITIONING & GROUPING
# ─────────────────────────────────────────────
import itertools

lst = [1, 2, 3, 4, 5, 6]

# chunks of size n
n = 2
chunks = [lst[i:i+n] for i in range(0, len(lst), n)]
# [[1,2],[3,4],[5,6]]

# groupby (requires sorted input)
data = [("a", 1), ("b", 2), ("a", 3), ("b", 4)]
data.sort(key=lambda x: x[0])
groups = {k: [v for _, v in g] for k, g in itertools.groupby(data, key=lambda x: x[0])}
# {'a': [1, 3], 'b': [2, 4]}

# ─────────────────────────────────────────────
# 23. USEFUL ITERTOOLS OPERATIONS
# ─────────────────────────────────────────────
import itertools

lst = [1, 2, 3]

perms   = list(itertools.permutations(lst))        # all orderings (6 total)
combs2  = list(itertools.combinations(lst, 2))     # [(1,2),(1,3),(2,3)]
combs_r = list(itertools.combinations_with_replacement(lst, 2))  # includes repeats
product = list(itertools.product([0, 1], repeat=3))# all 3-bit combos (8 total)
accum   = list(itertools.accumulate(lst))          # [1, 3, 6]  (running sum)
accum_p = list(itertools.accumulate(lst, lambda a, b: a * b))  # [1, 2, 6] (product)

# ─────────────────────────────────────────────
# 24. HEAPQ (PRIORITY QUEUE ON A LIST)
# ─────────────────────────────────────────────
import heapq

heap = [3, 1, 4, 1, 5, 9]
heapq.heapify(heap)               # convert list to min-heap in-place

heapq.heappush(heap, 2)           # push element
smallest = heapq.heappop(heap)    # pop smallest element → 1
peek     = heap[0]                # peek min without removing

n_small  = heapq.nsmallest(3, [5, 3, 8, 1, 9])  # [1, 3, 5]
n_large  = heapq.nlargest(3, [5, 3, 8, 1, 9])   # [9, 8, 5]

# max-heap via negation
max_heap = [-x for x in [3, 1, 4, 1, 5, 9]]
heapq.heapify(max_heap)
largest = -heapq.heappop(max_heap)  # 9

# ─────────────────────────────────────────────
# 25. CONVERSION
# ─────────────────────────────────────────────
lst = [1, 2, 3, 2, 1]

to_tuple   = tuple(lst)           # (1, 2, 3, 2, 1)
to_set     = set(lst)             # {1, 2, 3}
to_str     = str(lst)             # '[1, 2, 3, 2, 1]'
joined_str = ", ".join(map(str, lst))  # '1, 2, 3, 2, 1'
to_dict    = dict(enumerate(lst)) # {0:1, 1:2, 2:3, 3:2, 4:1}

# ─────────────────────────────────────────────
# 26. MISCELLANEOUS USEFUL PATTERNS
# ─────────────────────────────────────────────
lst = [1, 2, 3, 4, 5]

# unpack
a, b, c, d, e = lst
first, *rest   = lst               # first=1, rest=[2,3,4,5]
*init, last    = lst               # init=[1,2,3,4], last=5
head, *mid, tail = lst             # head=1, mid=[2,3,4], tail=5

# swap two elements
lst[0], lst[-1] = lst[-1], lst[0]  # [5, 2, 3, 4, 1]

# rotate left by k
k = 2
lst = lst[k:] + lst[:k]            # [3, 4, 1, 5, 2]

# check if sorted
is_sorted = all(lst[i] <= lst[i+1] for i in range(len(lst)-1))  # False

# frequency map
from collections import Counter
freq = Counter([1, 2, 2, 3, 3, 3])  # Counter({3:3, 2:2, 1:1})
top2 = freq.most_common(2)          # [(3,3),(2,2)]

# running max/min
running_max = list(itertools.accumulate(lst, max))
running_min = list(itertools.accumulate(lst, min))

# prefix sums
prefix = list(itertools.accumulate(lst))

# difference array
diff = [lst[i+1] - lst[i] for i in range(len(lst)-1)]
