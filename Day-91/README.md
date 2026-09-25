# Day 91 — LeetCode 225: Implement Stack using Queues

## Problem

Implement a Stack using a Queue.

The stack should support the following operations:

* `push(x)` — Push element `x` onto the stack.
* `pop()` — Remove the element on top of the stack.
* `top()` — Return the element on top of the stack.
* `empty()` — Return whether the stack is empty.

## Approach

A queue follows **FIFO (First In, First Out)**, while a stack follows **LIFO (Last In, First Out)**.

To make a queue behave like a stack, we use **queue rotation**.

Whenever a new element is pushed:

1. Add the new element to the queue.
2. Rotate all previously existing elements to the back.
3. This places the newly added element at the front.
4. Therefore, the front of the queue always represents the top of the stack.

For example:

```text
Push 10:
10

Push 20:
20 10

Push 30:
30 10 20
```

Now `30` is at the front, so removing the front element behaves exactly like a stack `pop()` operation.

## Java Code

```java
import java.util.*;

class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        this.queue = new LinkedList<Integer>();
    }

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);

        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
```

## Complexity Analysis

| Operation | Time Complexity |
| --------- | --------------- |
| `push()`  | O(n)            |
| `pop()`   | O(1)            |
| `top()`   | O(1)            |
| `empty()` | O(1)            |

**Space Complexity:** O(n)

## Key Concepts

* Stack
* Queue
* FIFO
* LIFO
* Queue Rotation
* Data Structure Implementation

## Learning

A queue can be used to implement a stack by rearranging the elements during `push()`. By keeping the newest element at the front, queue operations can simulate the required LIFO behavior of a stack.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
