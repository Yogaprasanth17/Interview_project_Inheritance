package Recursion;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,4,5,3,4};
        int target = 4;
        findAllIndex(a,4,0);
        System.out.println(list); // o/p [3, 4, 5, 8]
    }
    static List<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] a,int t,int i) {
        if (i == a.length) {
            return;
        }
        if (a[i] == t) {
            list.add(i);
        }
        findAllIndex(a,t,++i);
    }
}
