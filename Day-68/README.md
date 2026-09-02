# Day 68 — #DrGViswanathanChallenge

## Problem Solved

### 58. Length of Last Word

* **Approach:** String Traversal
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## Problem

Given a string consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring containing only non-space characters.

---

## Approach

I used a simple reverse traversal approach.

### Steps

1. Remove leading and trailing spaces using `trim()`.
2. Start traversing the string from the last character.
3. Count characters until a space is encountered.
4. Return the count as the answer.

---

## Example

### Input

```text
"Hello World"
```

### Traversal

```text
World
^^^^^
```

### Output

```text
5
```

---

## Complexity

### Time Complexity

```text
O(n)
```

The string is traversed at most once.

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## Key Learnings

* String manipulation
* Reverse traversal
* Using `trim()`
* Character comparison
* Counting characters
* Handling spaces efficiently

---

## Day 68 Complete

68/100 days completed.

Another string problem solved and another step forward in the DSA journey.

> Consistency over perfection. Keep learning and keep solving.
