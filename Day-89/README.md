# Day 89 — Palindrome Linked List

## LeetCode 234

### Problem

Given the head of a singly linked list, determine whether the linked list is a palindrome.

A linked list is a palindrome if its values read the same from left to right and right to left.

### Approach

The problem can be solved using the **Fast and Slow Pointer** technique and linked list reversal.

1. Initialize `slow` and `fast` pointers at the head.
2. Move `slow` one step and `fast` two steps at a time.
3. When `fast` reaches the end, `slow` reaches the middle of the linked list.
4. Reverse the second half of the linked list.
5. Use two pointers to compare the first half and the reversed second half.
6. If any pair of values is different, return `false`.
7. If all values match, return `true`.

### Example

Input:

```text id="m5z3kx"
head = [1,2,2,1]
```

Output:

```text id="r7v2pd"
true
```

Explanation:

The linked list reads the same in both directions:

```text id="c8n4qw"
1 -> 2 -> 2 -> 1
1 <- 2 <- 2 <- 1
```

Therefore, it is a palindrome.

### Java Code

```java id="u3f8pk"
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode secondHalf = reverse(slow);

        ListNode firstHalf = head;

        // Compare both halves
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
```

### Complexity

* Time Complexity: O(n)
* Space Complexity: O(1)

The linked list is traversed a constant number of times, and no additional data structure is used.

### Key Concepts

* Linked List
* Fast and Slow Pointers
* Linked List Reversal
* Two Pointer Technique
* Palindrome Checking

### Learning

This problem helped reinforce how the Fast and Slow Pointer technique can be combined with linked list reversal to solve problems efficiently using constant extra space.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
