package Recursion;

import java.util.*;

/* 
 * Recursion means calling the method it's self 
 * Recursion helps to solve the complex problem in simple way 
*/

    // The program to print the number from 1 to n

public class SimpleRecursion {

    // Recursion method
    static void print(int n) {
        if(n==0) {
            return;
        }
        System.out.print(n+" ");
         print(n-1);
    }

    // Drive method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Reading the n'Th number from the user
        print(n);

    }
}
