# 📅 Day 51 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 14. Longest Common Prefix

* **Approach:** Sorting + First/Last String Comparison
* **Language:** Java
* **Time Complexity:** O(n log n + m)
* **Space Complexity:** O(1) auxiliary space

---

## 💡 Approach Explanation

The solution uses sorting to make finding the common prefix easier.

### Steps:

1. Sort all strings using `Arrays.sort()`.
2. Store the first string in `first`.
3. Store the last string in `last`.
4. Compare characters of `first` and `last` from left to right.
5. Stop when:

   * The characters are different, or
   * One of the strings ends.
6. Return the characters collected in `StringBuilder`.

### 🔑 Key Observation

After lexicographically sorting the strings, the longest common prefix of the entire array must also be the common prefix of the **first and last strings**.

---

## 🔍 Example

### Input

```text
["flower", "flow", "flight"]
```

### After Sorting

```text
["flight", "flow", "flower"]
```

Compare:

```text
flight
flower
^^
```

Common prefix:

```text
"fl"
```

### Output

```text
"fl"
```

---

## 📚 Key Learnings

* Lexicographical sorting
* String comparison
* Character-by-character traversal
* Using `StringBuilder`
* Reducing multiple-string comparison to first/last strings

---

## 🚀 Day 51 Complete

Another problem solved in the 100-day challenge! 🔥

> Consistency over perfection. Keep solving, keep learning.
