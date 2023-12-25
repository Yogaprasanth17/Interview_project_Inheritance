import java.util.*;

public class Joesph {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int k = 2;
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        while (true) {
            if (list.size() == 1) {
                break;
            }
            for (int i=0;i<list.size();i++) {
                if (i == list.size()-1) {
                    list.remove(0);
                }
                if (i+(k-1) < list.size()) {
                    list.remove(i+(k-1));
                }
            }
        }
        System.out.println(list);
    }
}