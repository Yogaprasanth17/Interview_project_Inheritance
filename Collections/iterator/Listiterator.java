package Collections.iterator;
import java.util.*;
public class Listiterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        // Adding the elements to the list using "add()" method
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
        // Using simple for loop
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }

    }
}
