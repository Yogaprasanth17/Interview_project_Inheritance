package Search;

import java.util.*;

/*
 * Binary search 
 *  -> It is a searching process best it is sutted for sorted array
 *  -> After getting array and target the array is divided into two sub-arrays
 *  -> Which has lesser and greater side in two different sides with a middle element
 *  -> Using the middle element we are going to compare target 
 *  -> Where target is lesser or greater than the middle 
 *  -> If target is lesser than the middle element then the target is present in the left hand side of the array(assending order)
 *     then move/change the start => start = mid + 1 (Because we know that the element is present in the left hand side of the array)
 *  -> If target is greater than the middle element then the target is persent in the righ hand side of the array(assending order)
 *     then move/change the end => end = mid - 1 (Because we know that the element is present in the rigth hand of the array)
 */    

public class BinarySearch {

    // User-defined method
    public static int search(int[] array,int target) {
        int start = 0;                  // Initializing start = 0
        int end = array.length - 1;     // Initializing end = array length - 1
        if(array.length == 0) {         // return -1 if there is no elements in the array
            return -1;
        }
        boolean isAss = array[start] < array[end];      // boolean to check whether the array is in assending or descending order
        while(start <= end) {                          // while loop to iterate the array 
            int mid = start + (end - start)/2;     /* Getting the middle index by dividing the array using start and end */  
                                                /* (start + end)/2  == start + (end - start)/2 */
            if(target == array[mid]) {    // If target is equal to array of mid return's mid          
                return mid;
            }
            if(isAss){                      // For asscending order array
                if(target < array[mid]) {
                    end = mid - 1; 
                }
                else {
                    start = mid + 1;
                }
            }
            else{                           // For descending order array
                if(target > array[mid]) {
                    end = mid - 1; 
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;              // If the target is not present in the array the it return's -1
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size 
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        // Initializing the array and reading the elements 
        System.out.println("Enter the elements :");
        int[] array = new int[size];
        for(int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }

        // Reading the target element
        System.out.println("Enter the target element :");
        int target = sc.nextInt();

        // Calling the user-defined metho and printing the returned index
        System.out.println("The element is present in the index : "+search(array,target));
        
    }
}
