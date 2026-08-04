# 📅 Day 39 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Find the Duplicate Number (287)
- Approach: Floyd’s Cycle Detection
- Time Complexity: O(n)
- Space Complexity: O(1)

---

## 💡 Approach Explanation

- Treat array as a linked list:
  - index → node  
  - value → next pointer  

### 🔁 Step 1: Detect Cycle
- Use slow and fast pointers  
- slow = nums[slow]  
- fast = nums[nums[fast]]  

### 🔁 Step 2: Find Entry Point
- Move one pointer to start  
- Move both one step at a time  
- Where they meet = duplicate number  

---

## 📚 Key Learnings

- Applying linked list concepts to arrays  
- Cycle detection technique  
- Solving without extra space  

---

## 🚀 Notes

This is a very clever problem and frequently asked in interviews.