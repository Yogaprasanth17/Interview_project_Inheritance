package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int n = 3020400;
        int c = 0;
        System.out.print(count(n,c));
    }
    static int count(int n,int c) {
        if (n == 0) {
            return c;
        }
        int r = n%10;
        if (r==0) {
            return count(n/10, c+1);
        }
        return count(n/10, c);
    }
}
