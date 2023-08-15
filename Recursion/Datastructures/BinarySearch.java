package Recursion.Datastructures;

import java.util.*;

/*
 * Binary search using recursiion 
 * Return time is very important
*/

public class BinarySearch {

    // Recrsion method (assending order)
    static int binarySearch(int[] array,int target, int start, int end) {
            if(start > end) {   // If the element is not present in the array then it return -1
                return -1;         // (Or) if start = length of the array then it return -1 
            }
            int mid = (start+end)/2 ;   // Dividing the array into two sub-array 
            if(target == array[mid]) {      // If target is equal to array element then it return the index of the elemet           
                return mid;                     
            }
            if(target < array[mid]) {       // This condition is used to check the element postion whether it in right or left hand side
            return binarySearch(array, target, start, end - 1);     // If the target is less-than the mid then the target is present in the left hand side 
            }
            return binarySearch(array, target, start + 1, end);    // Else the target is greater-than the mid then the target is present in the rigth hand side - 
            
    
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // Reading the array elements 
        System.out.println("Enter the array elements :");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Reading the target value 
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        
        // Method call
        int answer = binarySearch(array,target,0,array.length - 1);
        System.out.println("Element present in the : "+answer);
    }
}