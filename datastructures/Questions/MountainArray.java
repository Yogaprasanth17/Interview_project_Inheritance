package Questions;

import java.util.Scanner;

/*
 *  Q => Find the target element in the mountain array
 *   -> first find the peek element (max) 
 *   -> using the peek element search the target in asscending and decending order
 *   -> we konw that one side of the array get incress and the other side get decressed
 */

public class MountainArray {
    // Main method
    public static void main(String[] args) {
        // mountain array
        int[] array = {1,2,3,4,5,3,1};
        // target element
        int target = 3;
        // passing the array and target and printing the return element
        System.out.println("The target element present in the index : "+ans(array, target));
    }
    // user-defined method(1) 
    static int ans(int[] array,int target){
        // the max/pivot is stored 
        int pivot = pivot(array);
        // searching in the first half of the array (asscending)
        // index 0 - pivot index
        int firstHalf = searchTarget(array,target,0,pivot);
        // if the target is found then it return the index 
        if(firstHalf!=-1){
            return firstHalf;
        }
        // else it search in the second half of the array(decending)
        // we know that it decress after the peek so (pivot + 1)
        return searchTarget(array, target, pivot + 1, array.length - 1);
    }
    // user-defined method(2) to find the peek element(max)
    static int pivot(int[] array) {
        // binary search method
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            int mid = start+(end-start)/2;
            // if the element in mid is < mid+1 element then move the start 
            // because there may be a possiblity max in the array
            // it means im in the asscending side of the array
            if(array[mid] < array[mid + 1]) {
                start = mid + 1;
            }
            // if the mid is > then there is no peek element in the array 
            // so move the end to mid position 
            else if(array[mid] > array[mid + 1]){
                end = mid;
            }
        }
        // in final the start and end pointer will be pointing at the max/peek element in the array
        return start; // or return end
    }
    // User-defined method(3) to return the target element
    static int searchTarget(int[] array,int target,int start,int end){
        // boolean to check whether the array in asscending or in decending 
        boolean isAss = array[start] < array[end];
        // Binary search
        while(start<=end){
            int m = start+(end-start)/2;
             if(target == array[m]){
                return m;
            } 
            // asscending 
            if(isAss){
                if(target < array[m]){
                    end = m - 1;
                }else {
                    start = m + 1;
                }
            }
            // decending 
            else{
                if(target > array[m]){
                    end = m - 1;
                }else {
                    start = m + 1;
                }
            }
        }
        return -1;
    }
}
