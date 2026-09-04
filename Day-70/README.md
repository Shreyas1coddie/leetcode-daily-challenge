# Day 70 — #DrGViswanathanChallenge

## Problem Solved

### 55. Jump Game

* **Approach:** Greedy
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## Problem

You are given an integer array `nums`, where each element represents the maximum jump length from that position.

Determine whether you can reach the last index of the array starting from the first index.

---

## Approach

I used a **Greedy Approach** to keep track of the farthest position that can be reached.

### Steps

1. Start from the first index.
2. Keep track of the maximum reachable index.
3. For each position, check whether the current index is reachable.
4. Update the farthest reachable position using the current index and its jump length.
5. If the last index becomes reachable, return `true`.
6. If a position cannot be reached, return `false`.

---

## Example

### Input

```text
[2, 3, 1, 1, 4]
```

### Process

```text
Index 0 → Can reach index 2
Index 1 → Can reach index 4
```

Since the last index can be reached:

```text
true
```

---

## Complexity

### Time Complexity

```text
O(n)
```

The array is traversed once.

### Space Complexity

```text
O(1)
```

Only a variable for tracking the maximum reachable position is required.

---

## Key Learnings

* Greedy algorithms
* Array traversal
* Maximum reachable position
* Reachability problems
* Optimizing brute-force approaches

---

## Day 70 Complete

70/100 days completed.

Another important greedy problem solved and another useful DSA pattern added to the journey.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
