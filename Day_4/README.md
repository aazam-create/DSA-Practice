# 🧠 Recursion Problems – Stair Path & Maze Path

This repository contains two fundamental recursion problems:

1. Stair Path Problem
2. Maze Path Problem

Both are very important for building strong recursion and DP concepts.

---

# 🚶‍♂️ 1. Stair Path Problem

## ❓ Problem Statement

Given a number `n` (stairs), find the total number of ways to reach the `nth` stair if:

* You can take **1 step** or **2 steps** at a time.

---

## 🧠 Intuition

To reach stair `n`, you can:

* Come from `(n-1)` using 1 step
* Come from `(n-2)` using 2 steps

So:

```
f(n) = f(n-1) + f(n-2)
```

---

## 🔹 Base Cases

```
f(1) = 1
f(2) = 2
```

OR

```
if (n <= 2) return n;
```

---

## 💻 Code (Java)

```java
public class Stairpath {
    public static int stair(int n) {
        if (n <= 2)
            return n;

        return stair(n - 1) + stair(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(stair(n)); // Output: 8
    }
}
```

---

## 📊 Example

| n | Ways |
| - | ---- |
| 1 | 1    |
| 2 | 2    |
| 3 | 3    |
| 4 | 5    |
| 5 | 8    |

---

## ⚠️ Time Complexity

```
O(2^n)  ❌ (slow)
```

👉 Can be optimized using DP (Memoization / Tabulation)

---

# 🧩 2. Maze Path Problem

## ❓ Problem Statement

Given a grid of size `n x m`, count the number of ways to go from:

* Start → `(0,0)`
* End → `(n-1, m-1)`

### Allowed Moves:

* Right (→)
* Down (↓)

---

## 🧠 Intuition

From any cell `(i, j)`:

* Move Right → `(i, j+1)`
* Move Down → `(i+1, j)`

So:

```
ways(i, j) = right + down
```

---

## 🔹 Base Conditions

### ✅ Destination Reached

```
if (row == m && col == n)
    return 1;
```

### ❌ Out of Boundary

```
if (row > m || col > n)
    return 0;
```

## 💻 Code (Java)

```java
public class Mazepath {
    public static int Maze(int row, int col, int m, int n) {

        // Destination
        if (row == m && col == n) {
            return 1;
        }

        // Out of bounds
        if (row > m || col > n) {
            return 0;
        }

        int right = Maze(row, col + 1, m, n);
        int down = Maze(row + 1, col, m, n);

        return right + down;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        System.out.println(Maze(0, 0, m - 1, n - 1)); // Output: 20
    }
}
```

---

## 📊 Example (4 × 4 Grid)

Total moves:

* Right = 3
* Down = 3

Total ways:

```
6C3 = 20
```

---

## ⚠️ Common Mistakes

❌ Using:

```
if (row == m || col == n)
```

👉 This is WRONG because:

* It counts paths before reaching destination

✅ Correct:

```
row == m && col == n
```

---

# 🔁 Recursion Pattern (Important)

For both problems:

### ✔️ Base Case

* Stop recursion

### ✔️ Choice

* Stair → 1 or 2 steps
* Maze → Right or Down

### ✔️ Combine

* Add results

---

# 🚀 Bonus (Next Step)

You can improve both problems using:

* Memoization (Top Down DP)
* Tabulation (Bottom Up DP)

---

# 📌 Final Summary

| Problem | Formula                |
| ------- | ---------------------- |
| Stair   | f(n) = f(n-1) + f(n-2) |
| Maze    | f(i,j) = right + down  |

---

🔥 If you understand these two problems, your recursion foundation is strong!
