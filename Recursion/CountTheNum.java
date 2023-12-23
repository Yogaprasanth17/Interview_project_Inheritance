package Recursion;

public class CountTheNum {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,4,3,3,8,1};
        int elmt = 1;
        System.out.println(count(a,elmt,0,0)); // o/p = 2 
    }
    static int count(int[] a,int elmt,int i,int c) {
        if (i == a.length) {
            return c;
        }
        if (a[i] == elmt) {
            return count(a, elmt, ++i, ++c);
        }
        return count(a, elmt, ++i, c);
    }
}
