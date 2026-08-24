# 📅 Day 58 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 39. Combination Sum

* **Approach:** Recursion + Backtracking
* **Language:** Java

---

## 💡 Problem

Given an array of distinct integers `candidates` and a target integer `target`, find all unique combinations where the chosen numbers sum to the target.

The same number may be chosen **unlimited times**.

---

## 🔍 Approach Explanation

I used **Backtracking** to explore all possible combinations.

### Steps:

1. Start with an empty combination.
2. Choose a candidate and add it to the current combination.
3. Reduce the remaining target.
4. Continue choosing candidates while the remaining target is greater than `0`.
5. If the remaining target becomes `0`, a valid combination is found.
6. Backtrack by removing the last selected candidate.
7. Continue exploring other possibilities.

---

## 🔍 Example

### Input

```text
candidates = [2, 3, 6, 7]
target = 7
```

### Valid Combinations

```text
[2, 2, 3]
[7]
```

### Output

```text
[[2, 2, 3], [7]]
```

---

## 🧠 Why Backtracking?

Backtracking allows us to:

* Make a choice
* Explore the choice
* Undo the choice
* Try another possibility

This is useful for problems involving combinations, permutations, and different possible choices.

---

## 📚 Key Learnings

* Recursion
* Backtracking
* Exploring decision trees
* Managing combinations
* Base cases
* Undoing choices during recursion

---

## ⏱️ Complexity

The exact time complexity depends on the number of possible combinations generated.

The algorithm can take **exponential time** in the worst case because it explores many possible combinations.

Space complexity depends on the recursion depth and the combinations stored in the result.

---

## 🚀 Day 58 Complete

**58/100 Days Completed! 🔥**

Another important DSA pattern added to the journey.

> Consistency over perfection. Keep learning, keep solving.
