# Day 71 — #DrGViswanathanChallenge

## Problem Solved

### 125. Valid Palindrome

* **Approach:** Two Pointers
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## Problem

Given a string, determine whether it is a palindrome after converting uppercase letters to lowercase and removing all non-alphanumeric characters.

---

## Approach

I used the **Two Pointer Technique**.

### Steps

1. Place one pointer at the beginning of the string.
2. Place another pointer at the end.
3. Skip characters that are not alphanumeric.
4. Convert the characters to the same case before comparison.
5. Compare the characters from both ends.
6. If they are different, return `false`.
7. Continue moving both pointers toward the center.
8. If all valid characters match, return `true`.

---

## Example

### Input

```text
"A man, a plan, a canal: Panama"
```

After ignoring spaces, punctuation, and case:

```text
"amanaplanacanalpanama"
```

The string reads the same from both directions.

### Output

```text
true
```

---

## Complexity

### Time Complexity

```text
O(n)
```

Each character is processed at most once.

### Space Complexity

```text
O(1)
```

Only two pointers and a constant amount of extra space are used.

---

## Key Learnings

* Two Pointer Technique
* String Traversal
* Character Comparison
* Alphanumeric Character Checking
* Case Conversion
* Palindrome Checking

---

## Day 71 Complete

71/100 days completed.

Another two-pointer problem solved and another important DSA pattern added to the journey.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
