package Questions;

public class SubArrayLargestSum {
    
    public static void main(String[] args) {
        int[] array = {7,2,5,8,10};
        int divNum = 2;
        System.out.println("The minimum sum of subarray is : "+sum(array,divNum));
    }
    public static int sum(int[] array, int divNum) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            start = Math.max(start, array[i]);
            end += array[i]; 
        }
        while (start < end) {
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for (int num : array) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
            if (pieces > divNum) {
                start = mid + 1;
            } 
            else {
                end = mid;
            }
        }
        return end;
    }
} 