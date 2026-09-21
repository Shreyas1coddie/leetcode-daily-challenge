# Day 87 — Find Pivot Index

## LeetCode 724

### Problem

Given an integer array `nums`, find the pivot index.

The pivot index is the index where the sum of all elements to the left is equal to the sum of all elements to the right.

If the index is at the beginning, the left sum is considered `0`.

If the index is at the end, the right sum is considered `0`.

Return the leftmost pivot index. If no pivot index exists, return `-1`.

### Approach

The problem can be solved using the total sum and a running left sum.

1. Calculate the total sum of all elements in the array.
2. Initialize `leftSum = 0`.
3. Traverse the array from left to right.
4. For each index, calculate:

   * `rightSum = totalSum - leftSum - nums[i]`
5. Compare `leftSum` and `rightSum`.
6. If they are equal, return the current index.
7. Otherwise, add `nums[i]` to `leftSum` and continue.
8. If no pivot index is found, return `-1`.

### Example

Input:

```text id="w1f8gc"
nums = [1,7,3,6,5,6]
```

Output:

```text id="c6x2kp"
3
```

Explanation:

At index `3`:

```text id="9y5m2r"
Left sum  = 1 + 7 + 3 = 11
Right sum = 5 + 6 = 11
```

Since both sums are equal, index `3` is the pivot index.

### Java Code

```java id="q8k2vx"
class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
```

### Complexity

* Time Complexity: O(n)
* Space Complexity: O(1)

The array is traversed twice, which is still O(n), and no extra array or data structure is required.

### Key Concepts

* Prefix Sum
* Running Sum
* Array Traversal
* Total Sum
* Pivot Index

### Learning

This problem helped reinforce the Prefix Sum concept and showed how maintaining a running sum can avoid repeated calculations and solve the problem efficiently.

GitHub Repository:

https://github.com/Shreyas1coddie/leetcode-daily-challenge
