# 📅 Day 50 — #DrGViswanathanChallenge

## 🎉 50 Days Completed!

### ✅ Problem Solved

**268. Missing Number**

* **Approach:** Sorting + Array Traversal
* **Language:** Java
* **Time Complexity:** O(n log n)
* **Space Complexity:** O(1) auxiliary space

---

## 💡 Approach Explanation

The array contains `n` distinct numbers from the range `[0, n]`, with exactly one number missing.

### Steps:

1. Sort the array using `Arrays.sort()`.
2. Check whether `0` is missing.
3. Traverse the sorted array.
4. Compare consecutive elements.
5. If there is a gap, return the missing number.
6. If no gap is found, the missing number is `n`.

---

## 🔍 Example

### Input

```text
[3, 0, 1]
```

### After Sorting

```text
[0, 1, 3]
```

There is a gap between `1` and `3`.

Therefore:

```text
Missing Number = 2
```

### Output

```text
2
```

---

## ⚠️ Edge Cases

### Missing number is 0

```text
[1, 2, 3]
→ 0
```

### Missing number is n

```text
[0, 1, 2, 3]
→ 4
```

### Missing number is in the middle

```text
[0, 1, 3]
→ 2
```

---

## 📚 Key Learnings

* Sorting arrays
* Detecting gaps in consecutive values
* Handling boundary cases
* Array traversal
* Understanding time complexity

---

## 🚀 Day 50 Milestone

**50/100 Days Completed! 🎯**

Halfway through the challenge.

50 days of consistency, learning, and improving one problem at a time. 🔥

> Consistency over perfection.
