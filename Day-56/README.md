# 📅 Day 56 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 58. Length of Last Word

* **Approach:** String Traversal + Reverse Traversal
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 💡 Problem

Given a string containing words separated by spaces, find the length of the **last word**.

A word is a maximal substring consisting of non-space characters.

---

## 🔍 Approach Explanation

I used a simple reverse traversal approach.

### Steps:

1. Used `trim()` to remove leading and trailing spaces.
2. Started from the last character of the string.
3. Traversed backwards.
4. Counted characters while they were not spaces.
5. Stopped when a space was encountered.
6. Returned the count.

---

## 🔍 Example

### Input

```text
"Hello World"
```

Starting from the end:

```text
World
^^^^^
```

The last word is:

```text
"World"
```

Therefore:

```text
Output: 5
```

---

## ⏱️ Complexity

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

## 📚 Key Learnings

* String manipulation
* Reverse traversal
* Using `trim()`
* Character comparison
* Counting characters
* Handling spaces

---

## 🚀 Day 56 Complete

**56/100 Days Completed! 🔥**

Another simple but useful string problem solved.

> Consistency over perfection. Keep learning, keep solving.
