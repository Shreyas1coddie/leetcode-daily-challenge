# 📅 Day 47 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 1. Ransom Note (383)

- Approach: Frequency Counting
- Data Structure: HashMap / Array
- Time Complexity: O(n + m)
- Space Complexity: O(1) for lowercase English letters

---

## 💡 Approach Explanation

The goal is to check whether all characters required by the
`ransomNote` are available in the `magazine`.

### 📌 Steps

1. Count the frequency of each character in `magazine`.
2. Traverse through `ransomNote`.
3. For every character:
   - Check whether it is available.
   - Decrease its frequency.
4. If any character is unavailable, return `false`.
5. Otherwise, return `true`.

---

## 📚 Key Learnings

- Character frequency counting
- Hashing
- String manipulation
- Efficient lookup

---

## 🚀 Notes

Frequency counting is useful for many string and array problems
where we need to track how often elements occur.