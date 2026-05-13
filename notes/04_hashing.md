# Table of Contents

- [Hashing](#hashing)

---

# Hashing

Hashing refers to the process of generating a small sized output (that can be used as index in a table) from an input of typically large and variable size. Hashing uses mathematical formulas known as hash functions to do the transformation. This technique determines an index or location for the storage of an item in a data structure called Hash Table.

# Hash Table Data Structure Overview

- It is one of the most widely used data structure after arrays.
- It mainly supports search, insert and delete in O(1) time on average which is more efficient than other popular data structures like arrays, Linked List and Self Balancing BST.
- We use hashing for dictionaries, frequency counting, maintaining data for quick access by key, etc.
- Real World Applications include Database Indexing, Cryptography, Caches, Symbol Table and Dictionaries.
- There are mainly two forms of hash typically implemented in programming languages.
- Hash Set : Collection of unique keys (Implemented as Set in Python, Set in JavaScrtipt, unordered_set in C++ and HashSet in Java.
- Hash Map : Collection of key value pairs with keys being unique (Implemented as dictionary in Python, Map in JavaScript, unordered_map in C++ and HashMap in Java)

Hashing is technique used in data strucuture to identify the location for storing/retrieving the value in the array.

# Collision Resolution Techniques

There are mainly two methods to handle collision:

Separate Chaining
Open Addressing

## 1. Separate Chaining

The idea behind Separate Chaining is to make each cell of the hash table point to a linked list of records that have the same hash function value. Chaining is simple but requires additional memory outside the table.

Example: We have given a hash function and we have to insert some elements in the hash table using a separate chaining method for collision resolution technique.

Hash function = key % 5,
Elements = 12, 15, 22, 25 and 37.

## 2. Open Addressing

In open addressing, all elements are stored in the hash table itself. Each table entry contains either a record or NIL. When searching for an element, we examine the table slots one by one until the desired element is found or it is clear that the element is not in the table.

### 2.a) Linear Probing

In linear probing, the hash table is searched sequentially that starts from the original location of the hash. If in case the location that we get is already occupied, then we check for the next location.

Calculate the hash key. i.e. key = data % size
Check, if hashTable[key] is empty
store the value directly by hashTable[key] = data
If the hash index already has some value then
check for next index using key = (key+1) % size
Check, if the next index is available hashTable[key] then store the value. Otherwise try for next index.
Do the above process till we find the space.

### 2.b) Quadratic Probing

Quadratic probing is an open addressing scheme in computer programming for resolving hash collisions in hash tables. Quadratic probing operates by taking the original hash index and adding successive values of an arbitrary quadratic polynomial until an open slot is found.

An example sequence using quadratic probing is:

H + 1 2 , H + 2 2 , H + 3 2 , H + 4 2 ...................... H + k 2

This method is also known as the mid-square method because in this method we look for i2-th probe (slot) in i-th iteration and the value of i = 0, 1, . . . n – 1. We always start from the original hash location. If only the location is occupied then we check the other slots.

Let hash(x) be the slot index computed using the hash function and n be the size of the hash table.

If the slot hash(x) % n is full, then we try (hash(x) + 1 2 ) % n.
If (hash(x) + 1 2 ) % n is also full, then we try (hash(x) + 2 2 ) % n.
If (hash(x) + 2 2 ) % n is also full, then we try (hash(x) + 3 2 ) % n.
This process will be repeated for all the values of i until an empty slot is found

Example: Let us consider table Size = 7, hash function as Hash(x) = x % 7 and collision resolution strategy to be f(i) = i 2 . Insert = 22, 30, and 50

### 2.c) Double Hashing

Double hashing is a collision resolving technique in Open Addressed Hash tables. Double hashing make use of two hash function,

The first hash function is h1(k) which takes the key and gives out a location on the hash table. But if the new location is not occupied or empty then we can easily place our key.
But in case the location is occupied (collision) we will use secondary hash-function h2(k) in combination with the first hash-function h1(k) to find the new location on the hash table.
This combination of hash functions is of the form

h(k, i) = (h1(k) + i \* h2(k)) % n

where

i is a non-negative integer that indicates a collision number,
k = element/key which is being hashed
n = hash table size.

# References

- [Hashing Introduction](https://www.geeksforgeeks.org/dsa/introduction-to-hashing-2/)
- [Collision Resolution Techniques](https://www.geeksforgeeks.org/dsa/collision-resolution-techniques/)
