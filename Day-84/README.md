# Day 84 — Last Stone Weight

## LeetCode 1046

### Problem

You are given an array of stones where `stones[i]` represents the weight of the `i-th` stone.

At each step, choose the two heaviest stones and smash them together.

* If both stones have the same weight, both are destroyed.
* If their weights are different, the lighter stone is destroyed and the heavier stone is reduced by the lighter stone's weight.

Continue until at most one stone remains.

Return the weight of the remaining stone, or `0` if no stones remain.

### Approach

The problem can be solved efficiently using a **Max Heap**.

In Java, `PriorityQueue` is a Min Heap by default, so a reverse comparator is used to create a Max Heap.

Steps:

1. Insert all stones into the Max Heap.
2. Remove the two largest stones.
3. Compare their weights.
4. If they are different, calculate the difference.
5. Insert the difference back into the heap.
6. Repeat until the heap contains at most one stone.
7. Return the remaining stone's weight.

### Example

Input:

```text id="a7qk2m"
stones = [2,7,4,1,8,1]
```

Output:

```text id="p4x8kd"
1
```

### Explanation

The two largest stones are repeatedly selected:

```text id="v6n2qs"
8 and 7 -> 1
4 and 2 -> 2
2 and 1 -> 1
1 and 1 -> 0
```

The final remaining weight is:

```text id="2c9r5w"
1
```

### Java Code

```java id="m3t7qx"
import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if (first != second) {
                pq.add(first - second);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}
```

### Complexity

* Time Complexity: O(n log n)
* Space Complexity: O(n)

Each stone can be inserted or removed from the heap, and each heap operation takes O(log n).

### Key Concepts

* PriorityQueue
* Max Heap
* Greedy Approach
* Heap Operations
* Array Processing

### Learning

This problem helped reinforce how a Max Heap can efficiently handle problems where we repeatedly need to access the largest elements.

GitHub Repository:
https://github.com/Shreyas1coddie/leetcode-daily-challenge
