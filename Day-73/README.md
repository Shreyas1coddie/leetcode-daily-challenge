# Day 73 — #DrGViswanathanChallenge

## Problem Solved

### 118. Pascal's Triangle

* **Approach:** Iterative Array/List
* **Language:** Java
* **Time Complexity:** O(n²)
* **Space Complexity:** O(n²) including the output

---

## Problem

Given an integer `numRows`, generate the first `numRows` of Pascal's Triangle.

In Pascal's Triangle, each number is the sum of the two numbers directly above it.

---

## Approach

I used an **iterative approach** to build the triangle row by row.

### Steps

1. Start with the first row containing `1`.
2. Create a new row for every subsequent level.
3. Add `1` as the first element.
4. Calculate the middle elements using the values from the previous row.
5. Add `1` as the last element.
6. Add the completed row to the result.
7. Continue until all required rows are generated.

---

## Example

### Input

```text
5
```

### Output

```text
[
    [1],
    [1, 1],
    [1, 2, 1],
    [1, 3, 3, 1],
    [1, 4, 6, 4, 1]
]
```

---

## Complexity

### Time Complexity

```text
O(n²)
```

Each element of every row is calculated once.

### Space Complexity

```text
O(n²)
```

The output contains all elements of Pascal's Triangle.

---

## Key Learnings

* Array and ArrayList usage
* Iterative problem solving
* Nested loops
* Building results incrementally
* Using previously calculated values

---

## Day 73 Complete

73/100 days completed.

Another array-based problem solved and another step forward in the DSA journey.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
