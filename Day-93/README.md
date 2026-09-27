# Day 93 — LeetCode 112: Path Sum

## Problem

Given the root of a binary tree and an integer `targetSum`, determine whether the tree has a root-to-leaf path such that the sum of all node values along the path equals `targetSum`.

A leaf is a node that has no left or right child.

## Approach

The problem can be solved using **Recursive DFS**.

At each node:

1. Subtract the current node's value from `targetSum`.
2. If the node is a leaf, check whether the remaining sum equals the node's value.
3. Recursively check the left and right subtrees.
4. Return `true` if either subtree contains a valid path.

The recursion continues until a valid root-to-leaf path is found or all possible paths have been checked.

## Java Code

```java
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        return hasPathSum(root.left, targetSum - root.val)
            || hasPathSum(root.right, targetSum - root.val);
    }
}
```

## Complexity Analysis

**Time Complexity:** O(n)

In the worst case, every node in the binary tree is visited.

**Space Complexity:** O(h)

The recursion stack can grow up to the height `h` of the tree.

## Key Concepts

* Binary Tree
* Depth First Search
* Recursion
* Root-to-Leaf Path
* Tree Traversal

## Learning

Recursive DFS is useful for tree path problems because each recursive call can carry information about the path being explored. Here, the remaining target sum is passed down to the next level.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
