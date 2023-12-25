package Recursion.Datastructures;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int r,int c,int max) {

        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                sort(arr, r, c+1, c);
            }
            else {
                sort(arr, r, c+1, max);
            }
        }
        else {
            // the maximum element will find at the the end of the loop 
            // so swap the maximum element with r-1 where r-1 is the length of the array
            int t = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = t;
            sort(arr, r-1, 0, 0);
        }

    }
}
