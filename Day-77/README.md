# Day 77 — #DrGViswanathanChallenge

## Problem Solved

### 3483. Unique 3-Digit Even Numbers

* **Approach:** Enumeration and Frequency Counting
* **Language:** Java
* **Time Complexity:** O(n³)
* **Space Complexity:** O(1)

---

## Problem

Given an array of digits, return the number of unique three-digit even numbers that can be formed using the given digits.

Each digit can only be used as many times as it appears in the input array.

A valid number must:

* Have exactly three digits.
* Not start with `0`.
* End with an even digit.
* Be unique.

---

## Approach

I used an **Enumeration and Frequency Counting** approach.

### Steps

1. Count the frequency of each digit from `0` to `9`.
2. Try every possible digit for the hundreds place.
3. Try every possible digit for the tens place.
4. Try every possible digit for the units place.
5. Check whether the selected digits are available in the required frequencies.
6. Ensure the first digit is not `0`.
7. Ensure the last digit is even.
8. Count every valid combination only once.

---

## Example

### Input

```text id="6q9g7m"
[2, 1, 3, 0]
```

Possible three-digit even numbers include:

```text id="8z2v1x"
102
120
130
132
210
230
302
310
312
320
```

Only numbers satisfying all the conditions are counted.

---

## Key Conditions

For a three-digit number:

### Hundreds Digit

```text
digit != 0
```

The number cannot start with zero.

### Units Digit

```text
digit % 2 == 0
```

The number must be even.

### Frequency

Each selected digit must be available in the input with sufficient frequency.

---

## Complexity

### Time Complexity

```text id="0q2z6p"
O(n³)
```

The enumeration checks possible choices for the three digit positions.

Since the number of possible digits is only 10, the practical number of combinations is very small.

### Space Complexity

```text id="j2y7m4"
O(1)
```

Only a fixed-size frequency array of size 10 is used.

---

## Key Learnings

* Frequency counting
* Enumeration
* Digit manipulation
* Handling duplicate digits
* Checking number constraints
* Constructing unique numbers

---

## Day 77 Complete

77/100 days completed.

Another enumeration problem solved and another useful pattern added to the DSA journey.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
