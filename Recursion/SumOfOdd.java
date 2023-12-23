package Recursion;

public class SumOfOdd {
    public static void main(String[] args) {
        int[] a = {10,20,3,40,50};
        System.out.print(sum(a,0,0));
    }
    static int sum(int[] a,int i,int c) {
        if (i ==  a.length) {
            return c;
        }
        if (a[i]%2!=0) {
            return sum(a, ++i, c+=a[i-1]); // why (c += a[i-1]) means in that sum(argument) we are incrementing the index value i. so it goes to next index so that we are decrementing a[i-1] 
        }
        return sum(a,++i,c);
        
    }
}
