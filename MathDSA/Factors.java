package MathDSA;

import java.util.*;
import java.util.ArrayList;

public class Factors {
   public static void main(String[] args) {
       sqrt2(36);
   } 
   // O(n)
   static void sqrt1(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
   }
   // O(sqrt(n))
   static void sqrt2(int n) {
     List<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0){
                // some times the n/i will be equal to the i to avoid repetation we using the chech here
                // Eg : n = 36 and there factors are : 1,2,3,4,5,6,9,12,18,36 here n/i = 6 and i = 6 to avoid repetation we use the check here
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
      // the list is printed in reverse order because the least number lies in the last in the list
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }
   }
}
