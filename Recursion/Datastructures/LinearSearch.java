package Recursion.Data_structures;
import java.util.*;
public class LinearSearch {

    // Recursion method
    static int searchNumber(int[] array, int target,int index) {
        
        // If the target is not present and the array length is = zero then it return -1 
        if(array.length == 0 || index==array.length) {
            return -1;
        }

        // This checks whether the target is equal to array elements
        if(array[index]==target){
            return index;   // Return's the index
        }                                       // (or)
        return searchNumber(array, target, index+1); // The function call it's self
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          // Reading the size for the array
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        // Initializing the array with respective size
        int[] array = new int[size];

        // Reading the array elements from the user
        System.out.println("Enter the array elements : ");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Reading the target element from the user
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        // Initializing the index/temporary variable as 0 
        // For iterating the array values
        int index=0;

        // Passing all the arguments to the recursion method
        System.out.println("The elements present in : "+searchNumber(array,target,index));
    }
    
}
