# 📅 Day 21 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Product of Array Except Self (238)
- Approach: Prefix & Suffix Arrays  
- Time Complexity: O(n)  
- Space Complexity: O(n)  

---

## 💡 Approach Explanation

- Created two arrays:
  - `left[]` → stores product of elements before current index  
  - `right[]` → stores product of elements after current index  

- Initialized:
  - left[0] = 1  
  - right[n-1] = 1  

- Filled left array:
  - left[i] = left[i-1] * nums[i-1]  

- Filled right array:
  - right[i] = right[i+1] * nums[i+1]  

- Final result:
  - ans[i] = left[i] * right[i]  

---

## 📚 Key Learnings

- Prefix & suffix product technique  
- Avoiding division in array problems  
- Breaking problem into smaller subproblems  

---

## 🚀 Notes

This is a very important interview problem.  
Can be further optimized to O(1) space by reusing the output array.