package Day_4;

import java.util.Scanner;

public class Mazepath {
    public static int Maze(int row, int col, int m, int n) {
        if (row == m || col == n) {
            return 1;
        }

        int rightway = Maze(row, col + 1, m, n);
        int downway = Maze(row + 1, col, m, n);
        return rightway + downway;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.println(Maze(0, 0, m - 1, n - 1));
    }
}
