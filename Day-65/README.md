# Day 65 — #DrGViswanathanChallenge

## Problem Solved

### 2965. Find Missing and Repeated Values

* **Approach:** Frequency Array
* **Language:** Java
* **Time Complexity:** O(n²)
* **Space Complexity:** O(n²)

---

## Problem

You are given an `n x n` grid containing numbers from `1` to `n²`.

One number appears twice and one number is missing.

The goal is to find both values.

---

## Approach

I used a **frequency array** to count the occurrences of every number.

### Steps

1. Calculate the total number of elements:

```text
n²
```

2. Create a frequency array of size `n² + 1`.
3. Traverse the entire grid.
4. For every value in the grid, increment its frequency.
5. Traverse the frequency array.
6. The number with frequency `2` is the repeated value.
7. The number with frequency `0` is the missing value.
8. Store both values in the result array.

---

## Example

### Input

```text
[[1,3],
 [2,2]]
```

The numbers should contain:

```text
1, 2, 3, 4
```

Actual values:

```text
1, 2, 2, 3
```

Therefore:

```text
Repeated = 2
Missing = 4
```

### Output

```text
[2,4]
```

---

## Complexity

### Time Complexity

```text
O(n²)
```

The grid contains `n²` elements, and each element is visited once.

The frequency array is also traversed up to `n²`, so the overall complexity remains O(n²).

### Space Complexity

```text
O(n²)
```

The frequency array stores the occurrence count for values from `1` to `n²`.

---

## Key Learnings

* 2D array traversal
* Frequency arrays
* Counting occurrences
* Finding repeated elements
* Finding missing elements
* Working with grid-based problems

---

## Day 65 Complete

65/100 days completed.

Another array-based problem solved and another useful technique added to the DSA journey.

> Consistency over perfection. Keep learning and keep solving.
