package Recursion;

import java.util.*;

/*
 * Binary search using recursiion 
 * Return time is very important
*/

public class BinarySearch {

    // Recrsion method (assending order)
    static int binarySearch(int[] array,int target, int start, int end) {
            if(start > end) {
                return -1;
            }
            int mid = (start+end)/2 ;
            if(target == array[mid]) {
                return mid;
            }
            if(target < array[mid]) {
            return binarySearch(array, target, start, end - 1);
            }
            return binarySearch(array, target, start + 1, end);
            
    
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        // Reading the size
        int size = sc.nextInt();
        System.out.println("Enter the array elements :");
        // Reading the array elements 
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        // Reading the target value 
        int target = sc.nextInt();
                    // Method call
        int answer = binarySearch(array,target,0,array.length - 1);
        System.out.println(answer);
    }
}