# 📘 Traversing an Array using Recursion (Java)

## 📌 Overview

This program demonstrates how to traverse and print elements of an array using **recursion** in Java.

Instead of using loops (like `for` or `while`), we use a recursive function to iterate through the array.

---

## 🧠 Concept Used

* Recursion
* Base Case & Recursive Case
* Array Traversal

---

## ⚙️ How It Works

### 🔹 Function: `print(int i, int arr[])`

* `i` → current index
* `arr[]` → array to traverse

### ✅ Base Case

```java
if (i == arr.length) {
    return;
}
```

➡️ Stops recursion when index reaches array length.

### 🔁 Recursive Case

```java
System.out.println(arr[i] + " ");
print(i + 1, arr);
```

➡️ Prints current element and calls function for next index.

---

## 💻 Code Implementation

```java
package Day_5;

public class Traversinginarray {
    public static void print(int i, int arr[]) {
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i] + " ");
        print(i + 1, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        print(0, arr);
    }
}
```

---

## ▶️ Output

```
1 
2 
3 
4 
5 
6 
7 
8 
9 
10 
```

---

## 📊 Dry Run Example

| Step | i   | Output |
| ---- | --- | ------ |
| 1    | 0   | 1      |
| 2    | 1   | 2      |
| 3    | 2   | 3      |
| ...  | ... | ...    |
| 10   | 9   | 10     |
| 11   | 10  | Stops  |

---

## ⚡ Time & Space Complexity

* ⏱ Time Complexity: **O(n)**
* 🧠 Space Complexity: **O(n)** (due to recursion stack)

---

## 🚀 Key Points

* Recursion replaces loops
* Each function call handles one element
* Stack memory is used for recursive calls
* Must always define a **base case** to avoid infinite recursion

---

## 📌 When to Use This Approach

✔️ When learning recursion
✔️ When problem naturally fits recursive pattern
❌ Not recommended for very large arrays (stack overflow risk)

---

## 🔥 Bonus Tip

You can also reverse traversal like this:

```java
print(i + 1, arr);
System.out.println(arr[i]);
```

---

## 📎 Conclusion

This is a simple and clean example to understand:

* How recursion works
* How arrays can be traversed without loops

---

⭐ If you found this helpful, try modifying:

* Print only even numbers
* Print sum of array using recursion
* Reverse the array output

Happy Coding! 🚀
