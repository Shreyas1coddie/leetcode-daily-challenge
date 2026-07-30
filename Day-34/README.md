# 📅 Day 34 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Subtree of Another Tree (572)
- Approach: DFS + Tree Comparison
- Time Complexity: O(n * m)
- Space Complexity: O(n)

---

## 💡 Approach Explanation

- Traverse the main tree  
- At each node:
  - Check if subtree starting here matches given tree  
- Use helper function (Same Tree logic)  

---

## 🔁 Helper Function (Same Tree)

- If both nodes are null → true  
- If one is null → false  
- If values differ → false  
- Recursively compare left & right  

---

## 📚 Key Learnings

- Combining multiple tree concepts  
- Reusing previous problem logic (Same Tree)  
- DFS traversal with condition checking  

---

## 🚀 Notes

A great problem to understand how different tree concepts connect together.