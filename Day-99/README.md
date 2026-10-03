# Day 99 — LeetCode 344: Reverse String

## Problem

Write a function that reverses a string.

The input is given as an array of characters `s`.

The string must be reversed **in-place** using O(1) extra space.

### Example

```text
Input:
s = ['h','e','l','l','o']

Output:
['o','l','l','e','h']
```

## Approach

The problem can be solved using the **Two Pointer** technique.

### Steps

1. Set one pointer at the beginning of the array.
2. Set another pointer at the end.
3. Swap the characters at the two pointers.
4. Move the left pointer forward.
5. Move the right pointer backward.
6. Continue until the pointers meet.

For example:

```text
['h', 'e', 'l', 'l', 'o']
  ↑               ↑
 left            right

Swap:

['o', 'e', 'l', 'l', 'h']

Move pointers inward and continue.
```

The string is reversed directly inside the original character array.

## Java Code

```java
class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
```

## Complexity Analysis

**Time Complexity:** O(n)

Each character is processed at most once during the swapping process.

**Space Complexity:** O(1)

Only a temporary variable and two pointers are used.

## Key Concepts

* Strings
* Character Arrays
* Two Pointers
* In-place Array Manipulation
* Swapping

## Learning

The two-pointer technique is useful for reversing arrays efficiently. By swapping elements from both ends and moving toward the center, the array can be reversed in-place without requiring additional memory.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
