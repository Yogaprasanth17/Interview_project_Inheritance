package Questions;

import java.util.*;

/*
 *  Q => Floor of the Number
 *  Working :
 *      same as ceiling but it return end because end contains the (greatest element <= target)
 */

public class FloorOfTheNumber {
    // User-defined method
    public static int floorOfTheNumber(int[] array, int target) {
        // Initializing the start and end
        int start = 0;
        int end = array.length - 1;
        // return -1 if length and target element is greater than last element
        if (array.length == 0 || target > array[array.length - 1]) {
            return -1;
        }
        // loop to iterate 
        while (start <= end) {
            // finding the middle index 
            int mid = start + (end - start)/2;
            // return index when target = array of mid
            if (target == array[mid]) {
                return mid;
            }
            // target is < array of the middle element means our target element is lies over start and mid so move the end 
            if (target < array[mid]) {
                end = mid - 1;
            }
            /// target is > array of the middle element means our target element is lies over mid and end so move the start 
            else {
                start = mid + 1;
            }
        }
        return end;  // if target not found then return the end because we want the greatest element <= target
    }
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading the size of the array
        System.out.println("Enter the size of the array :");
        int size = scanner.nextInt();
        // Initializing and reading the array elements
        System.out.println("Enter the elements :");
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = scanner.nextInt();
        }
        // Reading the target element
        System.out.println("Enter the target element :");
        int target = scanner.nextInt();
        // Passing the array and target as the argument 
        System.out.println("The element is present in the index : "+floorOfTheNumber(array,target));
    }
}