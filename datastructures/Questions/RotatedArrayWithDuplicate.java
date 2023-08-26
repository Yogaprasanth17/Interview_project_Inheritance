package Questions;

public class RotatedArrayWithDuplicate {

    static int binarySearch(int[] array, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (target == array[mid]) {
                return mid;
            }
            if (target < array[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int search(int[] array, int target) {
        int pivot = findThePivot(array);
        if (pivot == -1) {
            binarySearch(array, target, 0, array.length - 1);
        }
        if(array[pivot] == target) {
            return pivot;
        }
        if (array[0] <= target) {
            return binarySearch(array, target, 0, pivot - 1);
        }
        return binarySearch(array, target, pivot + 1, array.length - 1);
    }

    public static int findThePivot(int[] array) {
        if(array.length == 0) {
            return -1 ;
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }
            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }
            // removing the duplicate element
            if (array[mid] == array[start] && array[mid] == array[end]) {
                // check whether the start is the pivot 
                if (array[start] > array[start + 1]) {
                    return start;
                }
                start++; // if not increment the start
                // same for end 
                if (array[end] < array[end - 1]) {
                    return end - 1;  
                }
                end--;
            }
            else if (array[start] < array[mid] || (array[start] == array[mid] && array[mid] > array[end])) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,2,9,22,2};
        int target = 9;
        System.out.println("Target lies in the index : "+search(array, target));
    }
}
