package Sorting;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] ar = {5,4,3,2,1,8,9,7};
        System.out.print(Arrays.toString(mergeSort(ar)));
    }
    static int[] mergeSort(int[] ar) {
        if (ar.length == 1) {
            return ar;
        }
        int mid = ar.length / 2;
        // in "Arrays.copyOfRange()" method "new object is created"
        int[] left = mergeSort(Arrays.copyOfRange(ar, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(ar, mid, ar.length));

        return merge(left , right);
    }
    static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];
        int i = 0,j = 0,k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            }
            else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        } 
        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }     
        return ans;
    }
}