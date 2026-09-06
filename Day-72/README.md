# Day 72 — #DrGViswanathanChallenge

## Problem Solved

### 125. Valid Palindrome

* **Approach:** Two Pointer
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

1. Initialize one pointer at the beginning of the string.
2. Initialize another pointer at the end.
3. Skip non-alphanumeric characters from both sides.
4. Convert the characters to the same case.
5. Compare the characters at both pointers.
6. If they are different, return `false`.
7. Move both pointers toward the center.
8. If all valid characters match, return `true`.

---

## Example

### Input

```text
"A man, a plan, a canal: Panama"
```

After removing spaces and punctuation and converting to lowercase:

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

Only a constant amount of extra space is used.

---

## Key Learnings

* Two Pointer Technique
* String Traversal
* Character Comparison
* Alphanumeric Character Checking
* Case Conversion
* Palindrome Checking

---

## Day 72 Complete

72/100 days completed.

Another important two-pointer problem solved and another useful DSA pattern added to the journey.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
