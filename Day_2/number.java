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
        return;
    }
}
