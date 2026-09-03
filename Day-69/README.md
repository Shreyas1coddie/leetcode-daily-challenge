# Day 69 — #DrGViswanathanChallenge

## Problem Solved

### 202. Happy Number

* **Approach:** HashSet and Cycle Detection
* **Language:** Java
* **Time Complexity:** O(log n)
* **Space Complexity:** O(log n)

---

## Problem

Write an algorithm to determine whether a number `n` is a happy number.

A happy number is a number that eventually reaches `1` when repeatedly replaced by the sum of the squares of its digits.

If the process enters a cycle that does not include `1`, the number is not a happy number.

---

## Approach

I used a **HashSet** to detect cycles.

### Steps

1. Start with the given number.
2. Calculate the sum of the squares of its digits.
3. Store each calculated number in a HashSet.
4. Continue the process until:

   * The number becomes `1`, or
   * A number already present in the HashSet appears again.
5. If the number reaches `1`, return `true`.
6. If a cycle is detected, return `false`.

---

## Example

### Input

```text
19
```

### Process

```text
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
```

Since the process reaches `1`, `19` is a happy number.

### Output

```text
true
```

---

## Complexity

### Time Complexity

```text
O(log n)
```

The number of digits determines the work required to calculate the sum of squared digits, and the sequence reaches either `1` or a cycle.

### Space Complexity

```text
O(log n)
```

The HashSet stores previously encountered values.

---

## Key Learnings

* HashSet usage
* Cycle detection
* Digit manipulation
* Sum of squares of digits
* Detecting repeated states
* Mathematical problem solving

---

## Day 69 Complete

69/100 days completed.

Another problem solved and another useful DSA pattern added to the learning journey.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
