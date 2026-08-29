# Day 64 — #DrGViswanathanChallenge

## Problem Solved

### 392. Is Subsequence

* **Approach:** Recursion + Two Pointers
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(n) due to recursion stack

---

## Problem

Given two strings `s` and `t`, determine whether `s` is a subsequence of `t`.

A subsequence can be formed by deleting some or none of the characters from `t` without changing the order of the remaining characters.

---

## Approach

I used a **recursive two pointer approach**.

Two pointers are used:

* `i` points to the current character in `s`.
* `j` points to the current character in `t`.

### Steps

1. If `i` reaches the length of `s`, all characters of `s` have been found, so return `true`.
2. If `j` reaches the length of `t` while `s` still has characters remaining, return `false`.
3. If `s[i]` and `t[j]` are equal:

   * Move both `i` and `j` forward.
4. If they are different:

   * Move only `j` forward.
5. Continue recursively until one of the base cases is reached.

---

## Example

### Input

```text
s = "abc"
t = "ahbgdc"
```

The characters of `s` can be found in `t` in the same order:

```text
a → b → c
```

Therefore:

```text
Output: true
```

---

## Recursive Logic

When characters match:

```java
if (s.charAt(i) == t.charAt(j)) {
    return check(s, t, i + 1, j + 1);
}
```

Both pointers move forward.

When characters do not match:

```java
return check(s, t, i, j + 1);
```

Only the pointer for `t` moves forward because the current character of `t` cannot be used.

---

## Base Cases

### All characters of `s` are found

```java
if (i == s.length()) {
    return true;
}
```

### `t` is finished first

```java
if (j == t.length()) {
    return false;
}
```

---

## Complexity

### Time Complexity

```text
O(n)
```

The pointer `j` moves through `t` at most once, where `n` is the length of `t`.

### Space Complexity

```text
O(n)
```

Because the solution uses recursion, the recursive call stack can grow with the length of `t`.

---

## Key Learnings

* Recursion
* Two Pointer technique
* String traversal
* Character matching
* Recursive base cases
* Maintaining character order

---

## Day 64 Complete

64/100 days completed.

Another string problem solved and another useful approach added to the DSA journey.

> Consistency over perfection. Keep learning and keep solving.
