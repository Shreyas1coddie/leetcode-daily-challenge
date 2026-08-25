# 📅 Day 60 — #DrGViswanathanChallenge

## 🎯 60 Days Completed!

## ✅ Problem Solved

### 206. Reverse Linked List

* **Approach:** Iterative Pointer Approach
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 💡 Problem

Given the head of a singly linked list, reverse the linked list and return the new head.

### Example

```text
Input:
1 → 2 → 3 → 4 → 5

Output:
5 → 4 → 3 → 2 → 1
```

---

## 🔍 Approach Explanation

I used three pointers:

```text
prev
curr
next
```

### Steps:

1. Initialize `prev` as `null`.
2. Set `curr` to the head of the linked list.
3. Store the next node using `next`.
4. Change `curr.next` to point to `prev`.
5. Move `prev` to `curr`.
6. Move `curr` to `next`.
7. Continue until `curr` becomes `null`.
8. Return `prev` as the new head.

---

## 🔄 Example

Initial list:

```text
1 → 2 → 3 → null
```

After reversing:

```text
3 → 2 → 1 → null
```

The pointers gradually move through the list while reversing each connection.

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

Each node is visited exactly once.

### Space Complexity

```text
O(1)
```

Only a constant number of pointers are used.

---

## 📚 Key Learnings

* Linked List traversal
* Pointer manipulation
* Iterative reversal
* In-place algorithms
* Understanding `prev`, `curr`, and `next`

---

## 🚀 Day 60 Complete

**60/100 Days Completed! 🔥**

Only **40 more days** to complete the challenge!

> Consistency over perfection. Keep learning, keep solving.
