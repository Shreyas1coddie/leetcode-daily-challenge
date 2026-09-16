# Day 82 — Intersection of Two Arrays II

## LeetCode 350

### Problem

Given two integer arrays `nums1` and `nums2`, return their intersection.

Each element in the result must appear as many times as it shows in both arrays.

The order of the result does not matter.

### Approach

The problem can be solved efficiently using a `HashMap`.

1. Store the frequency of every element in `nums1` using a `HashMap`.
2. Traverse `nums2`.
3. For each element, check whether it exists in the frequency map and whether its frequency is greater than zero.
4. If available, add the element to the result.
5. Decrease its frequency in the map.
6. Continue until all elements of `nums2` have been processed.

### Example

Input:

```text id="5w9f2a"
nums1 = [1,2,2,1]
nums2 = [2,2]
```

Output:

```text id="4p3x1d"
[2,2]
```

Explanation:

The number `2` appears twice in both arrays, so it appears twice in the intersection.

### Difference from LeetCode 349

In **Q349 — Intersection of Two Arrays**, each element appears only once in the result.

In **Q350**, duplicate occurrences are preserved according to their frequency.

Example:

```text
nums1 = [1,2,2,1]
nums2 = [2,2,3]

Q349 → [2]

Q350 → [2,2]
```

### Complexity

* Time Complexity: O(n + m)
* Space Complexity: O(n)

Where:

* `n` = length of `nums1`
* `m` = length of `nums2`

### Key Concepts

* HashMap
* Frequency Counting
* Array Traversal
* Duplicate Handling
* Intersection of Arrays

### Learning

This problem helped reinforce how frequency maps can be used to handle duplicate elements while efficiently finding the intersection between two arrays.
