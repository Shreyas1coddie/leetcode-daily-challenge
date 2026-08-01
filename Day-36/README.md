# 📅 Day 36 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Reverse Pairs (493)
- Approach: Merge Sort (Modified)
- Time Complexity: O(n log n)
- Space Complexity: O(n)

---

## 💡 Approach Explanation

- Use divide & conquer (merge sort)
- Split array into two halves  
- Before merging:
  - Count pairs where:
    nums[i] > 2 * nums[j]  

### 🔁 Key Step:
- Use two pointers:
  - For each element in left array  
  - Move pointer in right array to count valid pairs  

- Merge arrays normally after counting  

---

## 📚 Key Learnings

- Counting problems using merge sort  
- Avoiding brute force with sorting  
- Efficient pair counting  

---

## 🚀 Notes

This is a classic hard problem and very important for mastering divide & conquer techniques.