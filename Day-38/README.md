# 📅 Day 38 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Subarray Sum Equals K (560)
- Approach: Prefix Sum + HashMap
- Time Complexity: O(n)
- Space Complexity: O(n)

---

## 💡 Approach Explanation

- Maintain a running sum (prefix sum)  
- Use a HashMap to store frequency of prefix sums  

### 🔁 Key Idea:
If:
currentSum - k = previousSum  

→ Then a subarray with sum k exists  

---

## 📌 Steps

- Initialize map with (0 → 1)  
- Traverse array:
  - Add current element to sum  
  - Check if (sum - k) exists in map  
  - Add its frequency to result  
  - Store current sum in map  

---

## 📚 Key Learnings

- Prefix sum optimization  
- Using HashMap for frequency tracking  
- Avoiding nested loops in subarray problems  

---

## 🚀 Notes

This is one of the most important problems for mastering prefix sum + hashmap pattern.