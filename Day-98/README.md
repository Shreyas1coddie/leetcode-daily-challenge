# Day 98 — LeetCode 680: Valid Palindrome II

## Problem

Given a string `s`, return `true` if the string can become a palindrome after deleting **at most one character**.

A palindrome reads the same forward and backward.

### Example

```text id="n3a8xk"
Input:
s = "abca"

Output:
true
```

We can delete `b`:

```text id="q6jv1m"
"aca"
```

which is a palindrome.

## Approach

The problem can be solved using the **Two Pointer** technique.

### Steps

1. Set one pointer at the beginning and another at the end of the string.
2. Compare the characters at both pointers.
3. If they match, move both pointers toward the center.
4. If they do not match, we are allowed to delete at most one character.
5. Check both possibilities:

   * Skip the left character.
   * Skip the right character.
6. If either remaining substring is a palindrome, return `true`.
7. If no mismatch occurs, the original string is already a palindrome.

## Java Code

```java id="q9s4kd"
class Solution {

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right)
                    || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
```

## Complexity Analysis

**Time Complexity:** O(n)

The string is traversed using two pointers. After the first mismatch, at most two additional palindrome checks are performed.

**Space Complexity:** O(1)

Only pointer variables are used; no additional data structure is required.

## Key Concepts

* Strings
* Two Pointers
* Palindrome
* Character Comparison
* Greedy Checking

## Learning

The two-pointer technique is useful for comparing characters from both ends of a string.

When a mismatch occurs, checking both possible single-character deletions allows us to determine whether the string can still become a palindrome without using extra space.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
