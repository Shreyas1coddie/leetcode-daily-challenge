# Day 75 — #DrGViswanathanChallenge

## Problem Solved

### 3871. Count Commas in Range II

* **Approach:** Mathematical Counting
* **Language:** Java
* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

---

## Problem

Given an integer `n`, count the total number of commas used when writing every integer from `1` to `n` in standard number formatting.

A comma is inserted after every three digits from the right.

For example:

```text
999       → 0 commas
1,000     → 1 comma
1,000,000 → 2 commas
```

---

## Approach

Instead of checking every number from `1` to `n`, I used a mathematical pattern.

### Key Observation

Numbers starting from:

```text
1,000
1,000,000
1,000,000,000
1,000,000,000,000
```

introduce an additional comma position.

For every threshold `x`, all numbers from `x` to `n` contain that particular comma.

Therefore, the number of contributions for a threshold is:

```text
n - x + 1
```

I started with `x = 1000` and multiplied `x` by `1000` after every iteration.

---

## Example

### Input

```text
1002
```

Numbers containing commas are:

```text
1,000
1,001
1,002
```

Each contains one comma.

Therefore:

```text
3
```

### Output

```text
3
```

---

## Another Example

### Input

```text
998
```

All numbers from `1` to `998` have fewer than four digits.

Therefore:

```text
0
```

---

## Algorithm

1. Initialize `ans = 0`.
2. Set `x = 1000`.
3. While `x <= n`:

   * Add `n - x + 1` to `ans`.
   * Multiply `x` by `1000`.
4. Return `ans`.

The approach counts each comma position separately, so every comma is counted exactly once.

---

## Complexity

### Time Complexity

```text
O(log n)
```

The threshold is multiplied by `1000` after every iteration, so only a small number of iterations are required.

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## Key Learnings

* Mathematical pattern recognition
* Range counting
* Number formatting patterns
* Avoiding brute force
* Handling very large values efficiently
* Mathematical optimization

---

## Day 75 Complete

75/100 days completed.

Three quarters of the 100-day challenge are now complete.

Another mathematical problem solved and another optimization pattern added to the DSA journey.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
