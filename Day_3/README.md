# 📘 Sum of First N Natural Numbers (Recursion)

This project demonstrates how to calculate the sum of the first **N natural numbers** using **recursion in Java**.

---

## 🚀 Problem Statement

Given a number `n`, calculate the sum:

1 + 2 + 3 + ... + n

---

## 🧠 Approach (Recursion)

We use a recursive function that keeps adding numbers until it reaches `0`.

### 🔁 Recursive Logic:

- Base Case:  
  When `n == 0`, print the sum.

- Recursive Step:  
  Call function with `n - 1` and add `n` to the sum.

---

## 💻 Code

```java
package Day_3;

import java.util.Scanner;

public class sum {
    public static void sum(int n, int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        sum(n - 1, s + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        sum(n, 0);
    }
}
```

---

## ▶️ How to Run

Compile the program:

```
javac sum.java
```

Run the program:

```
java sum
```

Enter a number when prompted.

---

## 🧪 Example

```
Enter n : 5
15
```

✔️ Explanation:  
1 + 2 + 3 + 4 + 5 = 15

---

## ⏱ Time & Space Complexity

- Time Complexity: O(n)  
- Space Complexity: O(n) (due to recursion stack)

---

## 📌 Key Concepts

- Recursion  
- Base Case & Recursive Calls  
- Stack Memory Usage  

---

## 📚 Alternative (Formula)

You can also solve this using a formula:

n(n + 1) / 2

This is more efficient (O(1)), but recursion helps in understanding problem-solving techniques.

---

## 👨‍💻 Author

Day 3 - DSA Practice (Java)