package Recursion.Datastructures;
import java.util.*;
public class LinearSearchWithDuplicate {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,4,5};
        int t = 4; 
        // List<Integer> list = new ArrayList<>();
        // System.out.print(duplicate(ar,t,0,list));

                                 // creating object for the Arraylist
        System.out.print(duplicate(ar,t,0,new ArrayList<>())); 
        //o/p [3, 4]
    }                                                       // creating a refrence for the arraylist
    static ArrayList<Integer> duplicate(int[] ar,int t,int i,ArrayList<Integer> list) {
        if (i == ar.length) {
            return list;
        }
        if (t == ar[i]) {
            list.add(i);
        }
        return duplicate(ar, t, ++i, list);
    }
}
