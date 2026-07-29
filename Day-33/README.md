# 📅 Day 33 — #DrGViswanathanChallenge

## ✅ Problems Solved

### 1. Same Tree (100)
- Approach: DFS (Recursion)
- Compare:
  - Structure of both trees  
  - Values at each node  

---

### 2. Balanced Binary Tree (110)
- Approach: DFS (Height Check)
- A tree is balanced if:
  - |left height - right height| ≤ 1 for every node  

---

## 💡 Approach Explanation

### Same Tree:
- If both nodes are null → true  
- If one is null → false  
- If values differ → false  
- Recursively compare left & right  

### Balanced Tree:
- Compute height recursively  
- Check balance condition at every node  
- Optimize by returning -1 if unbalanced  

---

## 📚 Key Learnings

- Tree comparison techniques  
- Height-based validation  
- Writing optimized recursive solutions  

---

## 🚀 Notes

These problems strengthen understanding of tree structure validation and recursion optimization.