# 📅 Day 53 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Two Sum (LeetCode 1)

* **Approach:** HashMap
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

---

## 💡 Problem

Given an integer array `nums` and an integer `target`, find the indices of two numbers whose sum equals the target.

Each input has exactly one solution.

---

## 🔍 Approach Explanation

Instead of checking every possible pair using nested loops, I used a `HashMap`.

### Steps:

1. Traverse the array.
2. For each number, calculate the required complement:

```text
complement = target - nums[i]
```

3. Check whether the complement already exists in the HashMap.
4. If it exists, return the stored index and the current index.
5. Otherwise, store the current number and its index in the HashMap.

---

## 🔍 Example

### Input

```text
nums = [2, 7, 11, 15]
target = 9
```

### Process

```text
2 → complement = 7
7 → complement = 2 → found!
```

### Output

```text
[0, 1]
```

Because:

```text
nums[0] + nums[1]
= 2 + 7
= 9
```

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

Each element is processed once.

### Space Complexity

```text
O(n)
```

The HashMap can store up to `n` elements.

---

## 📚 Key Learnings

* HashMap usage
* Complement technique
* Fast lookups
* Array traversal
* Improving a brute-force O(n²) solution to O(n)

---

## 🚀 Day 53 Complete

**53/100 Days Completed! 🔥**

Another classic DSA problem solved and another important pattern added to my toolkit.

> Consistency over perfection. Keep learning and keep solving.
