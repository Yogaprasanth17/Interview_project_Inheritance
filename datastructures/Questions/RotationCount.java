package Questions;

/* 
 *  if we find the pivot of the array then it is easy to find the times of rotation 
 *  pivot + 1
*/

public class RotationCount {

    public static int ans(int[] array) {
        int pivot = findThePivot(array);
        return pivot + 1;
    }
    
    public static int findThePivot(int[] array) {
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
            else {
                 if (array[start] <= array[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4,5,6,7,1,2,3};
        System.out.print(ans(array));
    }
}
