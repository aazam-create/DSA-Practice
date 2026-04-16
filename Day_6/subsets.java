public class subsets {
    public static void findSubsets(int i, String s, String ans) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        findSubsets(i + 1, s, ans + ch); // character lena hai
        findSubsets(i + 1, s, ans); // character nahi lena hai
    }

    public static void main(String[] args) {
        String s = "abcd";
        String ans = " ";
        findSubsets(0, s, ans);
    }
}
