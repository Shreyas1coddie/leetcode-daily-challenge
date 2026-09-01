# Day 67 — #DrGViswanathanChallenge

## Problem Solved

### 443. String Compression

* **Approach:** Two Pointer + In-place Compression
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## Problem

Given an array of characters, compress it using the following rules:

* Consecutive repeating characters should be replaced by the character followed by the number of repetitions.
* Characters that appear only once should remain as they are.
* The compression must be performed **in-place**.

For example:

```text
["a","a","b","b","c","c","c"]
```

becomes:

```text
["a","2","b","2","c","3"]
```

---

## Approach

I used a **Two Pointer approach** to perform the compression in-place.

### Steps

1. Traverse the character array.
2. Identify the current character.
3. Count how many consecutive times it appears.
4. Write the character at the current write position.
5. If the character appears more than once, write its count.
6. Continue processing the remaining characters.
7. Return the length of the compressed array.

---

## Example

### Input

```text
["a","a","b","b","c","c","c"]
```

The groups are:

```text
a → 2 times
b → 2 times
c → 3 times
```

Compressed result:

```text
["a","2","b","2","c","3"]
```

### Output Length

```text
6
```

---

## In-place Approach

The important part of this solution is that the compressed result is written directly into the original character array.

No additional array is required.

This makes the solution space efficient.

---

## Complexity

### Time Complexity

```text
O(n)
```

Each character is processed a constant number of times.

### Space Complexity

```text
O(1)
```

Only a few variables are used, and the compression is performed directly in the input array.

---

## Key Learnings

* Two Pointer technique
* In-place array manipulation
* String compression
* Counting consecutive elements
* Character arrays
* Constant space algorithms

---

## Day 67 Complete

67/100 days completed.

Another array and string problem solved and another useful in-place technique added to the DSA journey.

> Consistency over perfection. Keep learning and keep solving.
