# Day 96 — LeetCode 69: Sqrt(x)

## Problem

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer.

The returned result should be a non-negative integer.

For example:

```text
Input: x = 8
Output: 2

Because:
2 × 2 = 4
3 × 3 = 9 > 8
```

Therefore, the integer square root of `8` is `2`.

## Approach

The problem can be solved efficiently using **Binary Search**.

Instead of checking every number from `1` to `x`, search for the answer within a smaller range.

### Steps

1. Set `left = 1` and `right = x`.
2. Calculate the middle value.
3. If `mid * mid == x`, return `mid`.
4. If `mid * mid < x`, `mid` can be a possible answer, so search on the right side.
5. If `mid * mid > x`, search on the left side.
6. Keep track of the largest valid value.
7. Return the answer.

`long` is used while calculating `mid * mid` to prevent integer overflow.

## Java Code

```java
class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
```

## Complexity Analysis

**Time Complexity:** O(log x)

Binary Search reduces the search space by half in every iteration.

**Space Complexity:** O(1)

Only a constant number of variables are used.

## Key Concepts

* Binary Search
* Search Space Reduction
* Integer Square Root
* Overflow Handling
* Boundary Conditions

## Learning

Binary Search is not limited to searching for an element in a sorted array. It can also be used to search for the correct answer within a numerical range.

For this problem, we search for the largest integer whose square is less than or equal to `x`.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
