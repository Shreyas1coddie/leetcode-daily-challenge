# 📅 Day 44 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Binary Tree Paths (257)
- Approach: DFS (Recursion)
- Time Complexity: O(n)
- Space Complexity: O(h)

---

## 💡 Approach Explanation

- Traverse the tree using DFS  
- Maintain a string representing current path  

### 📌 Steps:
- If node is null → return  
- Add current node value to path  
- If leaf node:
  - Add path to result  
- Else:
  - Continue for left and right  

---

## 📚 Key Learnings

- Building paths during recursion  
- Understanding root-to-leaf traversal  
- Backtracking concept in trees  

---

## 🚀 Notes

A great problem to practice path-based recursion and strengthen DFS concepts in trees.