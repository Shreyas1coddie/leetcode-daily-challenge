# Day 94 — LeetCode 1122: Relative Sort Array

## Problem

Given two arrays `arr1` and `arr2`, sort the elements of `arr1` so that:

1. The relative ordering of the elements that appear in `arr2` is the same as their ordering in `arr2`.
2. Elements that do not appear in `arr2` are placed at the end in ascending order.

## Approach

The problem can be solved using **Frequency Counting**.

### Steps

1. Create a frequency array to store the number of occurrences of each element in `arr1`.
2. Traverse `arr2`.
3. For every element in `arr2`, add it to the result according to its frequency.
4. After processing `arr2`, traverse the frequency array in ascending order.
5. Add the remaining elements that were not present in `arr2`.

This produces the required relative ordering while keeping the remaining elements sorted.

## Java Code

```java id="f8n2qd"
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] freq = new int[1001];

        for (int num : arr1) {
            freq[num]++;
        }

        int index = 0;

        for (int num : arr2) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }

        for (int num = 0; num < freq.length; num++) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }

        return arr1;
    }
}
```

## Complexity Analysis

Let `n` be the size of `arr1`, `m` be the size of `arr2`, and `k` be the value range.

**Time Complexity:** O(n + m + k)

**Space Complexity:** O(k)

The frequency array is used to store the occurrence of each value.

## Key Concepts

* Arrays
* Frequency Counting
* Sorting
* Hashing Concept
* Array Traversal

## Learning

Frequency counting is useful when the range of values is known. Instead of repeatedly searching for elements, we can store their frequencies and construct the required sorted array efficiently.

## Repository

https://github.com/Shreyas1coddie/leetcode-daily-challenge
