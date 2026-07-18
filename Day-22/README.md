# 📅 Day 22 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Sort Colors (75)
- Approach: Dutch National Flag Algorithm  
- Time Complexity: O(n)  
- Space Complexity: O(1)  

---

## 💡 Approach Explanation

- Use three pointers:
  - low → for 0s  
  - mid → current element  
  - high → for 2s  

- Traverse the array:
  - If element = 0 → swap with low, move low & mid  
  - If element = 1 → move mid  
  - If element = 2 → swap with high, move high  

- Continue until mid > high  

---

## 📚 Key Learnings

- Three pointer technique  
- In-place sorting  
- Efficient array manipulation  

---

## 🚀 Notes

A classic problem to understand in-place sorting and pointer manipulation.  
Very frequently asked in coding interviews.