package Questions;

import java.util.*;


public class FirstAndLastPosition {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // reading the size 
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        // reading the elements
        System.out.println("Enter the elements :");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // reading the target 
        System.out.println("Enter the target value :");
        int target = sc.nextInt();
        // passing the array and target as the argument and printing the return value
        System.out.println("The first and last positon are: "+Arrays.toString(searchRange(array,target)));
    }
    // User-defined method which return integer array
    public static int[] searchRange(int[] array, int target) {
        // initializing new array with -1,-1 
        int[] ans = {-1,-1};
        // calling the user-defined 
        int start = search(array,target,true);
        int end = search(array,target,false);
        ans[0] = start; // storing it the respective index
        ans[1] = end;
        // if the target is not found then it return the ans array which contains {-1,-1}
        return ans;     
    }
    // User-defined method which return integer
    static int search(int[] array,int target,boolean firstStart) {
        // initializing ans = -1
        int ans = -1;
        int start = 0;
        int end = array.length - 1;
        // loop to iterate
        while (start <= end) {
            // finding the middle index
            int mid = start+(end-start)/2;
            // same working as binary search 
            if (target < array[mid]) {
                end = mid - 1;
            }
            else if (target > array[mid]) {
                start = mid + 1;
            }
            // follow's the ceiling 
            else {                      
                ans = mid;                  
                if (firstStart) {
                    end = mid-1;
                }
                else {
                    start = mid +1;
                }
            }
        }
        // retrun the index value
        return ans; 
    }
}