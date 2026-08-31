# Day 66 — #DrGViswanathanChallenge

## Problem Solved

### 13. Roman to Integer

* **Approach:** HashMap + String Traversal
* **Language:** Java
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## Problem

Given a string containing a Roman numeral, convert it into an integer.

Roman numerals use the following symbols:

| Symbol | Value |
| ------ | ----: |
| I      |     1 |
| V      |     5 |
| X      |    10 |
| L      |    50 |
| C      |   100 |
| D      |   500 |
| M      |  1000 |

---

## Approach

I used a HashMap to store the value of each Roman numeral and traversed the string.

### Steps

1. Store the Roman numeral values in a HashMap.
2. Traverse the string from left to right.
3. Get the value of the current character.
4. Compare it with the value of the next character.
5. If the current value is smaller than the next value, subtract it.
6. Otherwise, add it to the result.
7. Return the final result.

---

## Example

### Input

```text
MCMXCIV
```

The calculation is:

```text
M + CM + XC + IV
```

Which gives:

```text
1000 + 900 + 90 + 4 = 1994
```

### Output

```text
1994
```

---

## Special Cases

Some Roman numeral combinations use subtraction:

```text
IV = 4
IX = 9
XL = 40
XC = 90
CD = 400
CM = 900
```

The comparison with the next character allows these cases to be handled during traversal.

---

## Complexity

### Time Complexity

```text
O(n)
```

The string is traversed once.

### Space Complexity

```text
O(1)
```

Only a fixed number of Roman numeral symbols are stored.

---

## Key Learnings

* String traversal
* HashMap
* Conditional logic
* Character comparison
* Roman numeral conversion
* Handling subtraction cases

---

## Day 66 Complete

66/100 days completed.

Another string problem solved and another useful technique added to the DSA journey.

> Consistency over perfection. Keep learning and keep solving.
