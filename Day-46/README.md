# 📅 Day 46 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Minimum Absolute Difference in BST (530)

- Approach: Inorder Traversal (DFS)
- Time Complexity: O(n)
- Space Complexity: O(h)

---

## 💡 Approach Explanation

A Binary Search Tree has an important property:

**Inorder Traversal → Sorted Order**

So, instead of comparing every pair of nodes:

1. Perform inorder traversal.
2. Keep track of the previous node.
3. Calculate the difference between the current node and previous node.
4. Update the minimum difference.

### 📌 Formula

```text
difference = current.val - previous.val