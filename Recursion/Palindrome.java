package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1234321;
        System.out.print(palindrome(n));
    }
    static boolean palindrome(int n) {
        return n == rev(n);
    }
    static int rev(int n) {
        if (n%10 == n) {
            return n;
        }
        int r = n%10;
        return r * (int)Math.pow(10,(int)Math.log10(n)) + rev(n/10);
    }
}
