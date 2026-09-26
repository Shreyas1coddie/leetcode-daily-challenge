# Day 92 — LeetCode 2255: Count Prefixes of a Given String

## Problem

Given an array of strings `words` and a string `s`, count how many strings in `words` are prefixes of `s`.

A string is a prefix of another string if it appears at the beginning of that string.

### Example

```text
words = ["a", "b", "c", "ab", "ac"]
s = "abc"

Output:
3
```

The valid prefixes are:

```text
"a"
"b"
"ab"
```

## Approach

The solution iterates through every word in the `words` array.

For each word:

1. Check whether it is a prefix of `s`.
2. Use `startsWith()` to perform the check.
3. If it is a prefix, increment the count.
4. Return the final count.

## Java Code

```java
class Solution {
    public int countPrefixes(String[] words, String s) {

        int count = 0;

        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }

        return count;
    }
}
```

## Complexity Analysis

Let `n` be the number of words and `m` be the maximum length of a word.

**Time Complexity:** O(n × m)

Each word may require checking up to its length against `s`.

**Space Complexity:** O(1) auxiliary space.

## Key Concepts

* Strings
* Prefixes
* String Traversal
* `startsWith()`
* Array Traversal

## Learning

A prefix must always start from the beginning of the given string. The `startsWith()` method provides a simple way to check this condition without manually comparing every character.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
