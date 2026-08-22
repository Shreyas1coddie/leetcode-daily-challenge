# 📅 Day 57 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 31. Next Permutation

* **Approach:** Array Traversal + Two Pointers + Reversal
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 💡 Problem

Given an array of integers, rearrange the numbers into the **next lexicographically greater permutation**.

If the next greater permutation does not exist, rearrange the array into the lowest possible order.

---

## 🔍 Approach Explanation

The solution works from the right side of the array.

### Step 1: Find the Breakpoint

Traverse from right to left and find the first index `i` where:

```text id="z7c3ep"
nums[i] < nums[i + 1]
```

This is the position that needs to be increased.

### Step 2: Find the Next Larger Element

Starting from the right, find an element greater than `nums[i]`.

Swap it with `nums[i]`.

### Step 3: Reverse the Suffix

After the swap, reverse the portion of the array after index `i`.

This gives the smallest possible arrangement after the breakpoint.

---

## 🔍 Example

### Input

```text id="y9l5xd"
[1, 2, 3]
```

The next permutation is:

```text id="z5l6cn"
[1, 3, 2]
```

---

### Another Example

```text id="n5e4n5"
[3, 2, 1]
```

There is no greater permutation.

Therefore, reverse the entire array:

```text id="3pw8dr"
[1, 2, 3]
```

---

## ⏱️ Complexity

### Time Complexity

```text id="0c6qz5"
O(n)
```

The array is traversed a constant number of times.

### Space Complexity

```text id="8aqkqs"
O(1)
```

The rearrangement is performed in-place.

---

## 📚 Key Learnings

* Lexicographical ordering
* Finding the breakpoint
* Array swapping
* Two Pointer Technique
* Reversing an array
* In-place algorithms

---

## 🚀 Day 57 Complete

**57/100 Days Completed! 🔥**

Another important array problem completed in the challenge.

> Consistency over perfection. Keep learning, keep solving.
