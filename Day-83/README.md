# Day 83 — Word Pattern

## LeetCode 290

### Problem

Given a pattern and a string `s`, determine whether `s` follows the same pattern.

Each character in the pattern must map to exactly one word, and each word must map to exactly one character.

### Approach

The solution uses two `HashMap`s to maintain a two-way mapping.

1. Split the string into individual words using `split("\\s+")`.
2. Check whether the number of words is equal to the length of the pattern.
3. Create two HashMaps:

   * `map1`: Character -> String
   * `map2`: String -> Character
4. Traverse the pattern and words together.
5. Check whether the character already has a different word mapped to it.
6. Check whether the word already has a different character mapped to it.
7. If either mapping conflicts, return `false`.
8. Otherwise, store both mappings.
9. If the complete traversal finishes without conflicts, return `true`.

### Code

```java
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split("\\s+");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String w = words[i];

            if (map1.containsKey(c) && !map1.get(c).equals(w)) {
                return false;
            }

            if (map2.containsKey(w) && map2.get(w) != c) {
                return false;
            }

            map1.put(c, w);
            map2.put(w, c);
        }

        return true;
    }
}
```

### Example

Input:

```text
pattern = "abba"
s = "dog cat cat dog"
```

Output:

```text
true
```

The mapping is:

```text
a -> dog
b -> cat
```

The reverse mapping is also maintained:

```text
dog -> a
cat -> b
```

Therefore, the pattern is followed correctly.

### Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

Where `n` is the number of characters/words processed.

### Key Concepts

* HashMap
* String Manipulation
* Two-Way Mapping
* One-to-One Mapping
* Pattern Matching

### Learning

This problem reinforced the importance of maintaining mappings in both directions when a one-to-one relationship is required.

GitHub Repository:
https://github.com/Shreyas1coddie/leetcode-daily-challenge
