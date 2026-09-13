# Day 79 — Intersection of Two Arrays

## LeetCode 349

### Problem

Given two integer arrays `nums1` and `nums2`, return an array of their intersection.

Each element in the result must be unique, and the order of the result does not matter.

### Approach

The problem can be solved efficiently using a `HashSet`.

1. Store all elements of `nums1` in a `HashSet`.
2. Traverse `nums2`.
3. For each element, check whether it exists in the first set.
4. If it exists, add it to a second `HashSet`.
5. The second set automatically removes duplicate elements.
6. Convert the result set into an integer array.

### Example

Input:

```text
nums1 = [1,2,2,1]
nums2 = [2,2]
```

Output:

```text
[2]
```

### Why HashSet?

A `HashSet` provides average O(1) time complexity for checking whether an element exists.

It also automatically stores only unique values, which matches the requirement of the problem.

### Complexity

* Time Complexity: O(n + m)
* Space Complexity: O(n + m)

Where:

* `n` = length of `nums1`
* `m` = length of `nums2`

### Key Concepts

* HashSet
* Array Traversal
* Set Intersection
* Duplicate Handling
* Efficient Lookup

### Learning

This problem helped reinforce how sets can be used to efficiently find common unique elements between two arrays.

GitHub Repository:
https://github.com/Shreyas1coddie/leetcode-daily-challenge
