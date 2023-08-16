package Search;

import java.util.*;

public class LinearSearch {

    // User-defined method
    public static int search(int[] array, int target) {

        // Checking whether the array contains elements
        if(array.length==0) {
            return -1;
        }

        // Checking whether the target is = array elements
        for(int index=0;index<array.length;index++) {
            if(array[index] == target){
                return index;
            }
        }

        // If the give target is not present in the array then it return -1
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size of the array 
        System.out.println("Enter the array size :");
        int size = sc.nextInt();

        // Reading the array elements 
        System.out.println("Enter the array elements :");
        int[] array = new int[size];   
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }

        // Reading the target element
        System.out.println("Enter the target elements :");
        int target = sc.nextInt();

        // Call the user-defined method and printing the returned value
        System.out.println("The element present in the index : "+search(array,target));
    }
}
