package Questions;

import java.util.*;

public class InfiniteArrayTarget {

    // User-defined method (1) 
    static int answer(int[] array, int target) {
        // in initial start = 0 and end = 1
        int start = 0;
        int end = 1;
        // when the target is > array[end] then the target is not presented in the array limit so we need to iterate
        while (target > array[end]) {
            // temporary variable to store the start value ie.(end + 1)
            int temp = end + 1;
            // to set a new end 
     // end = "previous end + (size of the array) * 2"; as it is in index "start + 1" is used
            end = end + (end - start + 1) * 2;
            // stroing temp to start
            start = temp;
        }
        return search(array, target, start, end);
    }
    // User-defined method (2)
    static int search(int[] array, int target, int start, int end) {
        // Binary search
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == array[mid]) {
                return mid;
            }
            if (target < array[end]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return - 1;
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // As it is a infinite array it doesn't have start & end
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,40,50};
        System.out.println(Arrays.toString(array));
        // reading the target element
        System.out.println("Enter the target element :");
        int target = sc.nextInt();
        // printing the return value
        System.out.println("The element present in the index : "+answer(array,target));
    }
}
