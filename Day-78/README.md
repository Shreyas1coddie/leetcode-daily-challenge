# Day 78 — #DrGViswanathanChallenge

## Problem Solved

### 219. Contains Duplicate II

* **Approach:** HashSet + Sliding Window
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(k)

---

## Problem

Given an integer array `nums` and an integer `k`, determine whether there are two distinct indices `i` and `j` such that:

```text
nums[i] == nums[j]
```

and

```text
|i - j| <= k
```

---

## Approach

I used a **HashSet with a Sliding Window**.

The HashSet stores the elements currently inside a window of at most `k` elements.

### Steps

1. Traverse the array from left to right.
2. Before adding the current element, check whether it already exists in the HashSet.
3. If it exists, a duplicate is found within distance `k`, so return `true`.
4. Add the current element to the HashSet.
5. If the window size becomes greater than `k`, remove the element that is outside the window.
6. Continue until the complete array is processed.
7. If no valid duplicate is found, return `false`.

---

## Example

### Input

```text
nums = [1, 2, 3, 1]
k = 3
```

When we reach the second `1`:

```text
Index 0 → 1
Index 3 → 1
```

The difference between their indices is:

```text
3 - 0 = 3
```

Since:

```text
3 <= k
```

a valid duplicate exists.

### Output

```text
true
```

---

## Sliding Window

For example, with:

```text
nums = [1, 2, 3, 1]
k = 3
```

The HashSet maintains the elements inside the current window.

When an element moves outside the allowed distance, it is removed from the HashSet.

This allows duplicate checking in constant average time.

---

## Complexity

### Time Complexity

```text
O(n)
```

Each element is added to and removed from the HashSet at most once.

### Space Complexity

```text
O(k)
```

The HashSet stores at most `k` elements in the sliding window.

---

## Key Learnings

* HashSet
* Sliding Window
* Duplicate detection
* Array traversal
* Maintaining a fixed-size window
* Combining data structures with traversal techniques

---

## Day 78 Complete

78/100 days completed.

Another important problem solved using the combination of a HashSet and Sliding Window technique.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
