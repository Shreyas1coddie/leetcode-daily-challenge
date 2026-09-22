# Day 88 — Remove Linked List Elements

## LeetCode 203

### Problem

Given the head of a linked list and an integer `val`, remove all nodes from the linked list whose value is equal to `val`.

Return the head of the modified linked list.

### Approach

The problem can be solved using a **dummy node** and linked list traversal.

1. Create a dummy node that points to the original head.
2. Use a pointer to traverse the linked list.
3. Check the value of the next node.
4. If the next node contains the target value, skip that node by updating the `next` pointer.
5. Otherwise, move the pointer to the next node.
6. Continue until the end of the linked list is reached.
7. Return `dummy.next`.

Using a dummy node makes it easier to handle cases where the original head needs to be removed.

### Example

Input:

```text id="xq9m2k"
head = [1,2,6,3,4,5,6]
val = 6
```

Output:

```text id="m4t7pz"
[1,2,3,4,5]
```

Explanation:

All nodes containing the value `6` are removed from the linked list.

### Java Code

```java id="r8k3wv"
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {

            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
```

### Complexity

* Time Complexity: O(n)
* Space Complexity: O(1)

Each node is visited at most once, and only a constant amount of extra space is used.

### Key Concepts

* Linked List
* Linked List Traversal
* Node Deletion
* Dummy Node
* Pointer Manipulation

### Learning

This problem helped reinforce linked list traversal and node deletion. The dummy node technique makes deletion easier, especially when the head node itself needs to be removed.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
