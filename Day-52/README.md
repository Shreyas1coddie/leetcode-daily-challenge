# 📅 Day 52 — #DrGViswanathanChallenge

## ✅ Problems Solved

### 1. 136. Single Number

**Approach:** XOR / Bit Manipulation

The problem asks us to find the element that appears only once while every other element appears twice.

### 💡 Approach

Use the XOR operation on every element.

Important XOR properties:

```text
x ^ x = 0
x ^ 0 = x
```

Therefore, duplicate numbers cancel each other out, leaving only the number that appears once.

### Example

```text
Input:
[2, 2, 1]

2 ^ 2 ^ 1 = 1

Output:
1
```

### Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

### 2. 283. Move Zeroes

**Approach:** Two Pointer Technique

The goal is to move all zeroes to the end while maintaining the relative order of the non-zero elements.

### 💡 Approach

1. Use a pointer to track the position for the next non-zero element.
2. Traverse the array.
3. Move each non-zero element to the appropriate position.
4. Fill the remaining positions with zeroes.

### Example

```text
Input:
[0, 1, 0, 3, 12]

Output:
[1, 3, 12, 0, 0]
```

### Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 📚 Key Learnings

* XOR and Bit Manipulation
* Array Traversal
* Two Pointer Technique
* In-place Array Modification
* Maintaining relative order

---

## 🚀 Day 52 Complete

Solved **2 problems** today:

* ✅ Q136 — Single Number
* ✅ Q283 — Move Zeroes

Another productive day in the 100-day challenge. 🔥

> Consistency over perfection. Keep solving, keep learning.
