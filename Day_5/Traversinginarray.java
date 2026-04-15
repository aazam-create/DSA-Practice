package Day_5;

public class Traversinginarray {
    public static int print(int i, int arr[]) {
        if (i == 1) {
            return 1;
        }
        return print(i + 1, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        System.out.println(print(0, arr));
    }
}
