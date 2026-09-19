# Day 85 — Next Greater Element I

## LeetCode 496

### Problem

Given two arrays `nums1` and `nums2`, find the next greater element for every element of `nums1`.

For an element `x`, its next greater element is the first element to the right of `x` in `nums2` that is greater than `x`.

If no greater element exists, return `-1`.

### Approach

The problem can be solved using a **Monotonic Stack** and a `HashMap`.

1. Traverse `nums2`.
2. Maintain a decreasing stack.
3. For every current element:

   * While the stack is not empty and the current element is greater than the stack's top element, the current element is the next greater element of the top element.
   * Store this relationship in the `HashMap`.
   * Remove the element from the stack.
4. Push the current element into the stack.
5. After processing `nums2`, elements remaining in the stack do not have a greater element, so their answer is `-1`.
6. Traverse `nums1` and retrieve the answer for each element from the `HashMap`.

### Example

Input:

```text id="m2x8kp"
nums1 = [4,1,2]
nums2 = [1,3,4,2]
```

Output:

```text id="n7q3vd"
[-1,3,-1]
```

Explanation:

* For `4`, there is no greater element to its right, so the answer is `-1`.
* For `1`, the next greater element is `3`.
* For `2`, there is no greater element to its right, so the answer is `-1`.

### Complexity

* Time Complexity: O(n + m)
* Space Complexity: O(n)

Where:

* `n` = length of `nums2`
* `m` = length of `nums1`

Each element of `nums2` is pushed and popped from the stack at most once.

### Key Concepts

* Stack
* Monotonic Stack
* HashMap
* Next Greater Element
* Array Traversal

### Learning

This problem introduced the monotonic stack pattern, which is useful for efficiently solving problems involving the next greater or smaller element.

GitHub Repository:
https://github.com/Shreyas1coddie/leetcode-daily-challenge
