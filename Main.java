import java.util.*;
public class Main {
    public static void main(String args[]) {
        //Integer[] a;//= {1,2,3,5,6,7,8,4,10};
        // Arrays.sort(a,Collections.reverseOrder());
        // System.out.print(Arrays.toString(a));

        // List<Integer> list = new ArrayList<>();
        // for (int i=1;i<=10;i++) {
        //     list.add(i);
        // }
        // Integer[] a = list.toArray(new Integer[0]);

        // System.out.print(Arrays.toString(a));
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('g');
        list.add('y');
        Object[] a =  list.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%c ",a[i]);
        }
    }
}
