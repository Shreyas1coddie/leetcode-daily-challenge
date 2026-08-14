# Day 49 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 217. Contains Duplicate

**Approach:** Sorting + Adjacent Element Comparison

**Language:** Java

---

## 💡 Approach

The array is first sorted using `Arrays.sort()`.

After sorting, any duplicate values will appear next to each other.

I then traverse the sorted array and compare each element with the next element:

* If `nums[i] == nums[i + 1]`, a duplicate exists.
* If no adjacent elements are equal, the array contains no duplicates.

---

## 🔍 Example

```text
Input:
[1, 2, 3, 1]

After Sorting:
[1, 1, 2, 3]

1 == 1 → Duplicate found

Output:
true
```

---

## ⏱️ Complexity

* **Time Complexity:** O(n log n)

  * Sorting takes O(n log n)
  * Traversal takes O(n)

* **Space Complexity:** O(1) auxiliary space

  * The array is sorted in place.

---

## 📚 Key Learnings

* Sorting can simplify duplicate detection.
* Equal elements become adjacent after sorting.
* A simple traversal is enough to detect duplicates.
* Practiced array traversal and Java's `Arrays.sort()`.

---

## 🚀 Day 49 Complete

Another problem solved and another step forward in the 100-day challenge. 🔥

Consistency over perfection. 💪
