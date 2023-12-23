package Recursion.Datastructures;
import java.util.*;
public class ListObjectInBody {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5};
        int t = 4;
        System.out.print(findIndex(a,t,0));
    }
    static List<Integer> findIndex(int[] a,int t,int i) {
        List<Integer> list = new ArrayList<>();
        if (i == a.length) {
            return list;
        }
        if (t == a[i]) {
            list.add(i);
        }
        
        List<Integer> ans = findIndex(a, t, ++i);
        list.addAll(ans);
        return list;
    }
}
