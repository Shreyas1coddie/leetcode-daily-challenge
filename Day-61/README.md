# 📅 Day 61 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 121. Best Time to Buy and Sell Stock

* **Approach:** Greedy / Single Pass
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 💡 Problem

Given an array where `prices[i]` represents the price of a stock on the `i`th day, find the maximum profit that can be achieved by buying on one day and selling on a later day.

If no profit can be made, return `0`.

---

## 🔍 Approach Explanation

I used a **Greedy approach** by tracking the minimum price seen so far.

### Steps:

1. Start with the first price as the minimum price.
2. Traverse the array.
3. Update the minimum price whenever a lower price is found.
4. Calculate the profit using:

```text
current price - minimum price
```

5. Keep updating the maximum profit.
6. Return the maximum profit after traversing the array.

---

## 🔍 Example

### Input

```text
[7, 1, 5, 3, 6, 4]
```

Best choice:

```text
Buy  → 1
Sell → 6
```

Maximum profit:

```text
6 - 1 = 5
```

### Output

```text
5
```

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The array is traversed only once.

### Space Complexity

```text
O(1)
```

Only a few variables are required.

---

## 📚 Key Learnings

* Greedy algorithms
* Tracking minimum values
* Finding maximum profit
* Single-pass array traversal
* Constant-space optimization

---

## 🚀 Day 61 Complete

**61/100 Days Completed! 🔥**

Another important array and greedy problem completed.

> Consistency over perfection. Keep learning, keep solving.
