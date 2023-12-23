package Recursion;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        System.out.print(find(arr,4,0,arr.length-1));
    }
    static int find(int[] arr,int target,int s,int e) {
        
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s)/2;
        if (arr[mid] == target) {
            return mid;
        }
        // checking that the array of start to middle element are sorted 
        if (arr[s] <= arr[mid]) {
            // if its is lies btw the start and middle move the end
            if (target >= arr[s] && target <= arr[mid]) {
                return find(arr, target, s, mid-1);
            }
            // if its is not lies btw the start and middle move the start
            else {
                return find(arr, target, mid+1, e);
            }
        }
        // searching in the second half
        if (target >= arr[mid]&& target <= arr[e]) {
            return find(arr, target, mid+1, e);
        }
        return find(arr, target, s, mid-1);

    }
}
