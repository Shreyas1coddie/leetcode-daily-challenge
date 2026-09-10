# Day 76 — #DrGViswanathanChallenge

## Problem Solved

### 2265. Count Nodes Equal to Average of Subtree

* **Approach:** DFS / Postorder Traversal
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(h), where `h` is the height of the tree

---

## Problem

Given the root of a binary tree, count the number of nodes whose value is equal to the average of all values in their subtree.

The average is calculated using:

```text
subtree sum / number of nodes
```

The result is rounded down.

---

## Approach

I used **Recursive DFS with Postorder Traversal**.

The important idea is that for every node, I need two pieces of information from its subtree:

1. Sum of all node values
2. Number of nodes

My `dfs()` method returns both values using an integer array:

```text
{sum, count}
```

---

## Steps

1. If the current node is `null`, return `{0, 0}`.
2. Recursively calculate the sum and count of the left subtree.
3. Recursively calculate the sum and count of the right subtree.
4. Calculate the sum of the current subtree:

```text
sum = leftSum + rightSum + node.val
```

5. Calculate the number of nodes:

```text
count = leftCount + rightCount + 1
```

6. Calculate the subtree average using:

```text
sum / count
```

7. If the average is equal to the current node value, increment `ans`.
8. Return `{sum, count}` to the parent node.

---

## Example

### Input

```text
[4,8,5,0,1,null,6]
```

For the node `5`:

```text
Subtree = [5, 6]

Sum = 5 + 6 = 11
Count = 2

Average = 11 / 2 = 5
```

Since:

```text
5 == 5
```

this node is counted.

The problem's example has a total answer of `5` for this tree.

---

## Code Logic

```java
int[] dfs(TreeNode node) {
    if (node == null) {
        return new int[]{0, 0};
    }

    int[] left = dfs(node.left);
    int[] right = dfs(node.right);

    int sum = left[0] + right[0] + node.val;
    int count = left[1] + right[1] + 1;

    if (node.val == sum / count) {
        ans++;
    }

    return new int[]{sum, count};
}
```

The recursion processes the children before calculating the current node, which makes this a **postorder DFS** approach.

---

## Complexity

### Time Complexity

```text
O(n)
```

Every node is visited exactly once.

### Space Complexity

```text
O(h)
```

The recursion stack can grow up to the height of the tree.

For a balanced tree, this is approximately `O(log n)`, while for a skewed tree it can become `O(n)`.

---

## Key Learnings

* Binary Tree traversal
* DFS
* Postorder traversal
* Recursion
* Subtree calculations
* Returning multiple values from recursion
* Integer division
* Maintaining a global answer

---

## Day 76 Complete

76/100 days completed.

Another Binary Tree problem solved by using recursion to calculate useful information from each subtree.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
