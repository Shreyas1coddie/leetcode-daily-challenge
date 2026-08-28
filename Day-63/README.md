# Day 63 — #DrGViswanathanChallenge

## Problem Solved

### 88. Merge Sorted Array

* **Approach:** Two Pointer
* **Language:** Java
* **Time Complexity:** O(m + n)
* **Space Complexity:** O(1)

---

## Problem

Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` so that `nums1` becomes one sorted array.

The result must be stored directly inside `nums1`.

---

## Approach

I used the **Two Pointer technique** and started from the end of both arrays.

### Steps

1. Keep a pointer at the last valid element of `nums1`.
2. Keep another pointer at the last element of `nums2`.
3. Use a third position at the end of `nums1`.
4. Compare the elements pointed to by the two pointers.
5. Place the larger element at the current position from the end.
6. Move the corresponding pointer backward.
7. Continue until all elements are merged.

---

## Example

### Input

```text
nums1 = [1, 2, 3, 0, 0, 0]
m = 3

nums2 = [2, 5, 6]
n = 3
```

### Output

```text
[1, 2, 2, 3, 5, 6]
```

---

## Why Start From the End?

Since `nums1` has extra space at the end, filling the array from the back prevents us from overwriting elements that have not been processed yet.

This allows the merge to be performed in-place.

---

## Complexity

### Time Complexity

```text
O(m + n)
```

Each element is processed at most once.

### Space Complexity

```text
O(1)
```

No additional array is required.

---

## Key Learnings

* Two Pointer technique
* Merging sorted arrays
* In-place array manipulation
* Reverse traversal
* Efficient pointer movement

---

## Day 63 Complete

63/100 days completed.

Another array problem solved and another useful DSA pattern added to the journey.

> Consistency over perfection. Keep learning and keep solving.
