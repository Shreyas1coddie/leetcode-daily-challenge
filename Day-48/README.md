# 📅 Day 48 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Range Sum of BST (938)

- Approach: DFS (Recursion)
- Time Complexity: O(n) worst case
- Space Complexity: O(h)

---

## 💡 Approach Explanation

The goal is to calculate the sum of all node values
that are within the range `[low, high]`.

Since this is a Binary Search Tree, we can use its properties
to avoid unnecessary traversal.

### 📌 BST Optimization

- If `root.val < low`:
  - All values in the left subtree are smaller.
  - Traverse only the right subtree.

- If `root.val > high`:
  - All values in the right subtree are larger.
  - Traverse only the left subtree.

- Otherwise:
  - Add `root.val`
  - Traverse both subtrees.

---

## 📚 Key Learnings

- Binary Search Tree properties
- DFS recursion
- Tree pruning
- Efficient tree traversal

---

## 🚀 Notes

This problem helped strengthen my understanding of how BST properties
can be used to reduce unnecessary traversal.