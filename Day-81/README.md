# Day 81 — Isomorphic Strings

## LeetCode 205

### Problem

Given two strings `s` and `t`, determine whether they are isomorphic.

Two strings are isomorphic if the characters in `s` can be replaced to get `t`, while maintaining the same character pattern.

Each character must map to exactly one character, and two different characters cannot map to the same character.

### Approach

The problem can be solved using two HashMaps.

1. Create a mapping from characters of `s` to characters of `t`.
2. Create a reverse mapping from characters of `t` to characters of `s`.
3. Traverse both strings simultaneously.
4. For each pair of characters:

   * Check whether the existing mapping is consistent.
   * Check whether the reverse mapping is also consistent.
5. If either mapping conflicts, return `false`.
6. If the complete traversal is successful, return `true`.

### Example

Input:

```text
s = "egg"
t = "add"
```

Output:

```text
true
```

Explanation:

The mapping is:

```text
e -> a
g -> d
```

The same pattern is maintained in both strings, so they are isomorphic.

### Another Example

Input:

```text
s = "foo"
t = "bar"
```

Output:

```text
false
```

Explanation:

`f -> b` is valid, but the second `o` would need to map consistently to the same character. The pattern does not match.

### Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

Where `n` is the length of the strings.

### Key Concepts

* Strings
* HashMap
* Character Mapping
* Reverse Mapping
* One-to-One Relationship

### Learning

This problem helped reinforce the importance of maintaining a consistent one-to-one mapping when comparing patterns between two strings.

GitHub Repository:
https://github.com/Shreyas1coddie/leetcode-daily-challenge
