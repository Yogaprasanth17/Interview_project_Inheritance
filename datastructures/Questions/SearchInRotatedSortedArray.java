package Questions;

import java.util.*;

public class SearchInRotatedSortedArray {
    // User-defined method(1)
    static int search (int[] array, int target) {
        // calling the findThePivot() and storing the return value
        int pivot = findThePivot(array);
        // if the return value is -1 then there is no maximum element in the array
        if(pivot == -1) {
            return binarySearch(array,target,0,array.length - 1);
        } 
        // may be the target can be the largest element i.e pivot 
        // then return the pivot 
        if (array[pivot] == target) {
            return pivot;
        }
        // if the first element in the array is lesser than the target
        // then the target must be lies between the start and pivot because the array contains two sorted array i.e assending
        // i.e index 0 to pivot index contain assending order array 
        // then after the pivot index there will an another sorted array
        // so search between the start and pivot 
        if(array[0] < target) {
            return binarySearch(array, target, 0, pivot);
        }
        // if the first element in the array is greater than the target then the target lies between the pivot and last element od the array
        return binarySearch(array, target, pivot + 1, array.length - 1);
    }
    // User-defined method to search the target element
    // simple binary search
    static int binarySearch(int[] array, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (target == array[mid]) {
                return mid;
            }
            if (target < array[mid]) {
                end = mid - 1;
            }
            if (target > array[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
    // User-defined method to find the larget number in the array
    static int findThePivot(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            // if middle element is greater than the middle + 1 element then return mid
            // mid < end is check that reture false when the array index get exceeds
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }
            // if(mid < end && array[mid] < array[mid+1]) {
            //     return mid + 1;
            // }
            // if the middle element is < middle - 1 element then return the mid - 1
            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }
            else {
                // check whether the middle element is <= start element
                // if true move the end because the pivot will lies between the start and mid
                if (array[start] <= array[mid]) {
                    end = mid - 1;
                }
                // if the middle element is > start element then move the start
                // because the pivot will be liying in between the mid and end 
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    // Main method 
    public static void main(String[] args) {
        // array in rotated order
        int[] array = {4,5,6,7,0,1,2};
        // target element 
        int target = 4;
        // returning and printing 
        System.out.print(search(array, target));
    }
}