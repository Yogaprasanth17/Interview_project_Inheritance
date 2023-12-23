package Recursion;

public class PowerOfNum {
    public static void main(String[] args) {
        double base = 3.5;
        int exponent = 4;
        double ans = calculatePow(base,exponent);
        System.out.println(ans);
    }
    static double calculatePow(double base,int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double t = base;
        return t * calculatePow(base, --exponent);
    }
}
