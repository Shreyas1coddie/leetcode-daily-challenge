# Day 97 — LeetCode 278: First Bad Version

## Problem

You are given `n` versions of a product numbered from `1` to `n`.

At some point, a version becomes bad, and all versions after it are also bad.

Given the API `isBadVersion(version)`, find the **first bad version** while minimizing the number of API calls.

## Approach

The versions have a monotonic property:

```text
Good Good Good Good Bad Bad Bad Bad
                      ↑
                First Bad Version
```

This makes the problem suitable for **Binary Search**.

### Steps

1. Set `left = 1` and `right = n`.
2. Calculate the middle version.
3. Check `isBadVersion(mid)`.
4. If `mid` is bad, it could be the first bad version, so search the left half.
5. If `mid` is good, the first bad version must be on the right side.
6. Continue until `left` and `right` meet.
7. Return `left`.

## Java Code

```java id="j4k8pz"
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
```

## Complexity Analysis

**Time Complexity:** O(log n)

Binary Search reduces the search space by half in every iteration.

**Space Complexity:** O(1)

Only a constant number of variables are used.

## Key Concepts

* Binary Search
* Monotonic Conditions
* Search Space Reduction
* Boundary Conditions
* First Occurrence Search

## Learning

Binary Search is not limited to finding an exact value. It can also be used to find the **first position where a condition becomes true**.

In this problem, all versions before the first bad version are good, while the first bad version and all versions after it are bad.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
