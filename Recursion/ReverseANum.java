package Recursion;

public class ReverseANum {

    static int ans = 0;

    public static void main(String[] args) {
        int n = 98765;
        reverse1(n);
        System.out.print(reverse2(n));
    }
    // way - 1 (without return type)
    static void reverse1(int n) {
        ans = (ans * 10) + (n%10);
        if (n%10==n) {
            return; //ans;
        }
        reverse1(n/10);
    }
    // way - 2 (with return type)
    static int reverse2(int n) {
        if (n%10 == n) {
            return n;
        }
        int r = n%10;
        return (r * (int)(Math.pow(10,((int)Math.log10(n))))) + reverse2(n/10);
    }
}
  