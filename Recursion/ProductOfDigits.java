package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.print(mul(n));
    }
    static int mul(int n) {
        if (n%10 == n) {
            return n;
        }
        return n%10 * mul(n/10);
    }
}
