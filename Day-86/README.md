# Day 86 — Linked List Cycle

## LeetCode 141

### Problem

Given the head of a linked list, determine whether the linked list contains a cycle.

A cycle exists when a node can be reached again by continuously following the `next` pointer.

Return `true` if a cycle exists, otherwise return `false`.

### Approach

The problem can be solved using the **Fast and Slow Pointer** technique.

1. Initialize two pointers, `slow` and `fast`, at the head of the linked list.
2. Move `slow` one step at a time.
3. Move `fast` two steps at a time.
4. If the linked list contains a cycle, the two pointers will eventually meet.
5. If `fast` reaches `null` or `fast.next` reaches `null`, there is no cycle.
6. Return the appropriate boolean result.

### Example

Input:

```text
head = [3,2,0,-4]
```

The last node points back to the node containing `2`.

Output:

```text
true
```

Explanation:

Since the linked list contains a cycle, the fast and slow pointers will eventually meet.

### Java Code

```java
class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
```

### Complexity

* Time Complexity: O(n)
* Space Complexity: O(1)

The algorithm uses only two pointers and does not require an additional data structure.

### Key Concepts

* Linked List
* Fast and Slow Pointers
* Floyd's Cycle Detection
* Two Pointer Technique
* Cycle Detection

### Learning

This problem helped reinforce the Fast and Slow Pointer technique and showed how a linked-list cycle can be detected in O(n) time with O(1) extra space.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
