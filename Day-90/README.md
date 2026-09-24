# Day 90 — Implement Queue using Stacks

## LeetCode 232

### Problem

Implement a first-in-first-out (FIFO) queue using only two stacks.

The queue should support the following operations:

* `push(x)` — Add an element to the back of the queue.
* `pop()` — Remove and return the element at the front.
* `peek()` — Return the element at the front.
* `empty()` — Check whether the queue is empty.

### Approach

The queue is implemented using two stacks:

* `input` — Stores newly added elements.
* `output` — Provides elements in queue order.

The important idea is that a stack follows **LIFO**, while a queue requires **FIFO**.

When the `output` stack is empty, all elements from `input` are transferred to `output`.

This reverses their order and makes the oldest element available at the top of `output`.

### Example

Operations:

```text id="a4m7pz"
push(1)
push(2)
push(3)
peek()
pop()
```

The elements are initially stored in the input stack:

```text id="x8k2qd"
input:  [1, 2, 3]
```

When the output stack is empty, the elements are transferred:

```text id="v5n9rc"
output: [3, 2, 1]
```

The top of the output stack is `1`, which is the first element inserted.

Therefore:

```text id="j3f6tw"
peek() -> 1
pop()  -> 1
```

### Java Code

```java id="q7m2vx"
class MyQueue {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {

        moveElements();

        return output.pop();
    }

    public int peek() {

        moveElements();

        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    private void moveElements() {

        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }
}
```

### Complexity

| Operation | Complexity     |
| --------- | -------------- |
| `push()`  | O(1)           |
| `pop()`   | Amortized O(1) |
| `peek()`  | Amortized O(1) |
| `empty()` | O(1)           |

Space Complexity: **O(n)**

### Key Concepts

* Stack
* Queue
* FIFO
* LIFO
* Two Stack Technique
* Amortized Complexity

### Learning

This problem helped reinforce the difference between FIFO and LIFO and showed how two stacks can be combined to implement queue behavior efficiently.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
