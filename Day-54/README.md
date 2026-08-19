# 📅 Day 54 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 169. Majority Element

* **Approach:** Boyer-Moore Voting Algorithm
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 💡 Problem

Given an integer array `nums`, find the element that appears more than `n / 2` times.

The majority element is guaranteed to exist.

---

## 🔍 Approach Explanation

I used the **Boyer-Moore Voting Algorithm**.

The algorithm maintains:

* `candidate` → Current possible majority element
* `count` → Voting count for the candidate

### Steps:

1. If `count == 0`, choose the current element as the candidate.
2. If the current element equals the candidate, increase `count`.
3. Otherwise, decrease `count`.
4. After traversing the entire array, the candidate is the majority element.

---

## 🔍 Example

### Input

```text
[2, 2, 1, 1, 1, 2, 2]
```

The majority element is:

```text
2
```

Because `2` appears more than `n / 2` times.

### Output

```text
2
```

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The array is traversed once.

### Space Complexity

```text
O(1)
```

Only a candidate and a counter are maintained.

---

## 📚 Key Learnings

* Boyer-Moore Voting Algorithm
* Greedy problem solving
* Array traversal
* Constant-space algorithms
* Finding majority elements efficiently

---

## 🚀 Day 54 Complete

**54/100 Days Completed! 🔥**

Another important algorithm added to my DSA toolkit.

> Consistency over perfection. Keep learning, keep solving.
