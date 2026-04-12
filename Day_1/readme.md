# 📘 Day 1 - Factorial using Recursion

## 🧩 Problem Statement

Given a non-negative integer `n`, find its factorial using recursion.

Factorial is defined as:

* `n! = n × (n-1) × (n-2) × ... × 1`
* `0! = 1`

---

## 🧠 Approach

We use **recursion**, where a function calls itself.

### Steps:

* Base Case:

  * If `n == 0` or `n == 1`, return `1`
* Recursive Case:

  * Return `n * factorial(n - 1)`

---

## 🔁 Example

Input:

```id="0a7k0u"
n = 5
```

Output:

```id="c1q3vm"
120
```

Explanation:

```id="3l5rfd"
5 * 4 * 3 * 2 * 1 = 120
```

---

## 💻 Java Code

```java id="0n6a4o"
class Solution {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
```

---

## ⏱ Time Complexity

* O(n)

---

## 💾 Space Complexity

* O(n) (due to recursion stack)

---

## ⚠️ Notes

* Recursion uses stack memory
* Large values of `n` may cause stack overflow
* Iterative approach can be more space efficient

---

## 🎯 Learning

* Understanding recursion
* Importance of base case
* Breaking problems into smaller parts

---

⭐ Keep practicing daily to master DSA!
