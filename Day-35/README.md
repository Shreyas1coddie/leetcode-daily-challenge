# 📅 Day 35 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Largest Rectangle in Histogram (84)
- Approach: Monotonic Stack
- Time Complexity: O(n)
- Space Complexity: O(n)

---

## 💡 Approach Explanation

- Use a stack to maintain indices of increasing heights  
- For each bar:
  - While current height < stack top → calculate area  
- Width calculation:
  - If stack empty → width = i  
  - Else → width = i - stack.peek() - 1  

- After traversal, process remaining stack  

---

## 📚 Key Learnings

- Monotonic stack pattern  
- Efficient boundary detection  
- Avoiding brute-force solutions  

---

## 🚀 Notes

This is a classic hard problem and a must-know for mastering stack-based algorithms.