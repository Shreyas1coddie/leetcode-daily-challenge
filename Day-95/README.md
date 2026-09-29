# Day 95 — LeetCode 844: Backspace String Compare

## Problem

Given two strings `s` and `t`, determine whether they are equal after processing backspace characters.

The character `#` represents a backspace.

A backspace removes the previous character if one exists.

### Example

```text
s = "ab#c"
t = "ad#c"

After processing:

s = "ac"
t = "ac"

Output:
true
```

## Approach

The problem can be solved using a **Stack**.

For each string:

1. Traverse the characters one by one.
2. If the character is not `#`, push it onto the stack.
3. If the character is `#` and the stack is not empty, remove the top element.
4. After processing both strings, compare their final contents.

The stack works naturally because a backspace always removes the **most recently added character**, which follows the LIFO principle.

## Java Code

```java id="c5m8rt"
class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(ch);
            }
        }

        return stack1.equals(stack2);
    }
}
```

## Complexity Analysis

Let `n` and `m` be the lengths of strings `s` and `t`.

**Time Complexity:** O(n + m)

Each character is processed once.

**Space Complexity:** O(n + m)

In the worst case, all characters can be stored in the stacks.

## Key Concepts

* Strings
* Stack
* LIFO
* String Traversal
* Backspace Handling

## Learning

The stack is a natural data structure for backspace operations because the most recently added character is the first one that needs to be removed.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
