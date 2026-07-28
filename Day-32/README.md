# 📅 Day 32 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Diameter of Binary Tree (543)
- Approach: DFS (Recursion)
- Time Complexity: O(n)
- Space Complexity: O(n)

---

## 💡 Approach Explanation

- For each node:
  - Find height of left subtree  
  - Find height of right subtree  
- Diameter at that node = leftHeight + rightHeight  
- Keep track of maximum diameter  

### 🔁 Key Trick:
- Use a global variable to store max diameter  
- Return height while computing diameter  

---

## 📚 Key Learnings

- Combining multiple results in recursion  
- Tree height calculation  
- Understanding longest path in tree  

---

## 🚀 Notes

This is a classic problem that teaches how to optimize recursive tree solutions.