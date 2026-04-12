# 📘 Day 02 - Print Numbers using Recursion

## 🧩 Problem Statement

Given a number `n`, print numbers from `n` to `1` using recursion.

---

## 🧠 Approach (Recursion)

We use recursion where the function calls itself with a smaller value.

### Steps:

1. **Base Case**:

   * If `n == 0`, stop recursion
2. **Recursive Case**:

   * Print current number `n`
   * Call function with `n-1`

---

## 🔁 Example

Input:

```
n = 5
```

Output:

```
5
4
3
2
1
```

---

## 💻 Java Code

```java
package Day_2;
import java.util.Scanner;

public class number {
    public static void number(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        number(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        number(n);
    }
}
```

---

## ⏱ Time Complexity

* **O(n)** → function is called `n` times

---

## 💾 Space Complexity

* **O(n)** → due to recursion call stack

---

## ⚠️ Notes

* Recursion stops when base condition is met
* If base case is missing, it will cause infinite recursion
* Each function call is stored in the call stack

---

## 🎯 Key Learning

* Understanding recursion flow
* Importance of base condition
* Breaking problem into smaller subproblems

---

⭐ Keep practicing daily to master recursion and DSA!
