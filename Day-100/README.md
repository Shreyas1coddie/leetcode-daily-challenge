# Day 100 — LeetCode 678: Valid Parenthesis String

## 100 Days Completed

Today marks the completion of my 100-day coding challenge.

For the past 100 days, I have consistently practiced problem solving and DSA by solving LeetCode problems.

This journey helped me improve my understanding of different patterns, algorithms, data structures, and problem-solving techniques.

Day 100 is not the end of the journey. It is a milestone that motivates me to continue learning and improving.

---

## Problem

Given a string `s` containing `(`, `)` and `*`, determine if the string is valid.

The character `*` can be treated as:

* `(`
* `)`
* An empty string

A valid parenthesis string must have properly balanced parentheses.

### Example

```text
Input:
s = "(*))"

Output:
true
```

The `*` can be treated as `(`, making the string valid.

---

## Approach

The problem can be solved using a **Greedy Range Technique**.

Instead of tracking one exact number of open parentheses, we maintain a range:

* `minOpen` = minimum possible number of open parentheses
* `maxOpen` = maximum possible number of open parentheses

### For each character:

If the character is `(`:

```text
minOpen++
maxOpen++
```

If the character is `)`:

```text
minOpen--
maxOpen--
```

If the character is `*`:

It can act as `(`, `)` or empty.

Therefore:

```text
minOpen--
maxOpen++
```

`minOpen` cannot go below zero because we cannot have a negative number of open parentheses.

If `maxOpen` becomes negative at any point, the string cannot be valid.

At the end:

```text
minOpen == 0
```

means the string can be balanced.

---

## Java Code

```java
class Solution {
    public boolean checkValidString(String s) {

        int minOpen = 0;
        int maxOpen = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                minOpen++;
                maxOpen++;
            } 
            else if (ch == ')') {
                minOpen--;
                maxOpen--;
            } 
            else {
                minOpen--;
                maxOpen++;
            }

            if (maxOpen < 0) {
                return false;
            }

            if (minOpen < 0) {
                minOpen = 0;
            }
        }

        return minOpen == 0;
    }
}
```

## Complexity Analysis

**Time Complexity: O(n)**

The string is traversed once.

**Space Complexity: O(1)**

Only two variables are used regardless of the input size.

---

## Key Concepts

* Greedy Algorithm
* Strings
* Parentheses
* Range Tracking
* Edge Case Handling
* Constant Space

---

## Learning

The main learning from this problem is that sometimes we do not need to know one exact state.

By maintaining a range of possible states, we can efficiently handle characters whose meaning can change, such as `*` in this problem.

This challenge also taught me that consistency is one of the most important parts of improving at DSA.

**100 days completed. The journey continues.**

---

## Challenge Milestone

**Day 1 → Day 100**

100 days of:

* Consistent problem solving
* Learning new patterns
* Revising old concepts
* Debugging mistakes
* Improving DSA skills
* Building problem-solving confidence

This is a milestone, not an endpoint.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
