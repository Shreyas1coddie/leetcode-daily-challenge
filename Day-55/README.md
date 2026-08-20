# 📅 Day 55 — #DrGViswanathanChallenge

## ✅ Problem Solved

### 50. Pow(x, n)

* **Approach:** Binary Exponentiation / Fast Power
* **Language:** Java
* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

---

## 💡 Problem

Given a floating-point number `x` and an integer `n`, calculate:

```text
x^n
```

---

## 🔍 Approach Explanation

Instead of multiplying `x` by itself `n` times, I used **Binary Exponentiation**.

### Steps:

1. Store the exponent in a `long` variable.
2. If the exponent is negative, convert it to positive.
3. While the exponent is greater than `0`:

   * If the exponent is odd:

     * Multiply `x` into `ans`.
     * Decrease the exponent by `1`.
   * If the exponent is even:

     * Square `x`.
     * Divide the exponent by `2`.
4. If the original exponent was negative, return `1 / ans`.

---

## 🔍 Example

### Input

```text
x = 2
n = 5
```

The algorithm reduces the exponent efficiently:

```text
2^5
= 2 × 2^4
= 2 × 4^2
= 2 × 16
= 32
```

### Output

```text
32.0
```

---

## ⚠️ Handling Negative Exponents

For:

```text
x = 2
n = -5
```

We first calculate:

```text
2^5 = 32
```

Then:

```text
1 / 32 = 0.03125
```

Therefore:

```text
2^-5 = 0.03125
```

---

## 🧠 Important Java Detail

I used:

```java
long nn = n;
```

instead of keeping the exponent as an `int`.

This is important because:

```text
Integer.MIN_VALUE = -2147483648
```

Its positive value cannot be represented by an `int`.

Using `long` allows the absolute value to be handled safely.

---

## ⏱️ Complexity

### Time Complexity

```text
O(log n)
```

The exponent is repeatedly divided by `2`.

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## 📚 Key Learnings

* Binary Exponentiation
* Fast Power
* Iterative optimization
* Handling negative exponents
* Integer overflow
* Reducing O(n) operations to O(log n)

---

## 🚀 Day 55 Complete

**55/100 Days Completed! 🔥**

Another important algorithm added to my DSA journey.

> Consistency over perfection. Keep learning, keep solving.
