# Day 74 — #DrGViswanathanChallenge

## Problem Solved

### 78. Subsets

* **Approach:** Backtracking
* **Language:** Java
* **Time Complexity:** O(n × 2^n)
* **Space Complexity:** O(n) excluding the output

---

## Problem

Given an integer array `nums` containing unique elements, return all possible subsets.

The solution must not contain duplicate subsets.

---

## Approach

I used **Backtracking** to generate all possible subsets.

### Steps

1. Start with an empty subset.
2. Add the current subset to the result.
3. Iterate through the available elements.
4. Choose an element and add it to the current subset.
5. Recursively generate subsets using the remaining elements.
6. Remove the selected element to backtrack.
7. Continue until all possible choices have been explored.

---

## Example

### Input

```text id="q8xj9m"
[1, 2, 3]
```

### Output

```text id="f6y7wp"
[
    [],
    [1],
    [1, 2],
    [1, 2, 3],
    [1, 3],
    [2],
    [2, 3],
    [3]
]
```

There are `2^n` possible subsets for an array of `n` elements.

---

## Complexity

### Time Complexity

```text id="n6s5rz"
O(n × 2^n)
```

There are `2^n` subsets, and copying each subset can take up to `O(n)` time.

### Space Complexity

```text id="c9h4ku"
O(n)
```

The recursion and current subset require at most `O(n)` auxiliary space, excluding the output.

---

## Key Learnings

* Backtracking
* Recursion
* Subset generation
* Decision trees
* Choosing and undoing choices
* Exploring all possible combinations

---

## Day 74 Complete

74/100 days completed.

Another important backtracking problem solved and another useful DSA pattern added to the journey.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
