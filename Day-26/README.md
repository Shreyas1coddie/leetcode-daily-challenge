# 📅 Day 26 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Search a 2D Matrix (74)
- Approach: Binary Search
- Time Complexity: O(log(m * n))
- Space Complexity: O(1)

---

## 💡 Approach Explanation

- Matrix is sorted row-wise and each row’s first element > last of previous row  
- Treat matrix as a single sorted array  
- Apply binary search from 0 → m*n - 1  

### 🔁 Index Mapping:
- row = mid / number_of_columns  
- col = mid % number_of_columns  

---

## 📚 Key Learnings

- Converting 2D → 1D for optimization  
- Binary search on non-traditional structures  
- Index math tricks  

---

## 🚀 Notes

A classic interview problem combining matrix + binary search.