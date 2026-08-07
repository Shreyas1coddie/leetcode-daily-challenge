# 📅 Day 42 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Minimum Depth of Binary Tree (111)
- Approach: DFS (Recursion)
- Time Complexity: O(n)
- Space Complexity: O(h)

---

## 💡 Approach Explanation

- If root is null → return 0  

### ⚠️ Important Cases:
- If left is null → return 1 + right depth  
- If right is null → return 1 + left depth  

- Otherwise: