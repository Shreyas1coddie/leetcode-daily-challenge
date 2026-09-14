# Day 80 — Valid Anagram

## LeetCode 242

### Problem

Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

Two strings are anagrams if they contain the same characters with the same frequencies.

### Approach

The problem can be solved using a frequency array.

1. First, check whether both strings have the same length.
2. Create an integer array of size 26 for lowercase English letters.
3. Traverse string `s` and increment the frequency of each character.
4. Traverse string `t` and decrement the frequency of each character.
5. Finally, check every value in the frequency array.
6. If any value is not zero, the strings are not anagrams.
7. If all values are zero, the strings are anagrams.

### Example

Input:

```text
s = "anagram"
t = "nagaram"
```

Output:

```text
true
```

Explanation:

Both strings contain the same characters with the same frequencies.

### Complexity

* Time Complexity: O(n)
* Space Complexity: O(1)

The frequency array always has a fixed size of 26, so the extra space is constant.

### Key Concepts

* String Manipulation
* Character Frequency
* Frequency Array
* Hashing
* Array Traversal

### Learning

This problem helped reinforce the use of frequency counting to efficiently compare two strings without sorting them.

GitHub Repository:
https://github.com/Shreyas1coddie/leetcode-daily-challenge
