package Recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.print(sort(a,0));
    }
    static boolean sort(int[] a,int c) {
         if (c == a.length-1) {
            return true;
        }
        if (c > 0 && a[c-1] > a[c]) {
            return false;
        }
        return sort(a,++c);
    }
}
