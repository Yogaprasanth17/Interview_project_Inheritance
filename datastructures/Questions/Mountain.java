package Questions;

import java.util.*;

/*
 *  Q => Find the peek in the mountain arary
 * 
 *  Working : arr[] = {1,2,3,4,5,3,1} contains both the assending and decending element
 * 
 *      pointers =>    start                   end    |                      |   array[3] < array[3 + 1] 
 *      index    =>      0  1   2   3   4   5   6     |  mid = (0+6)/2 = 3   |         4  <  5  
 *      elements =>      1  2   3   4   5   3   1     |                      |       start = mid + 1 (3+1)
 *      
 *      pointers =>     start      end    |                      |   array[5] > array[5 + 1] 
 *      index    =>        4   5    6     |  mid = (4+6)/2 = 5   |         3  >  1  
 *      elements =>        5   3    1     |                      |       end = mid       
 *      
 *      pointers =>     start  end    |                      |   array[4] > array[4 + 1] 
 *      index    =>        4    5     |  mid = (4+5)/2 = 4   |         5  >  3  
 *      elements =>        5    3     |                      |       end = mid  
 *  
 *      pointers =>     start & end   |                      |   
 *      index    =>         4         |     loop break's     |         
 *      elements =>         5         |                      |                      
 */

public class Mountain {
      // User-defined method
    static int search(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while(start < end) {
            int mid = start + (end-start)/2;
            // check the array[mid] is > array[mid+1] then set end = mid
            // becasue there may be greater element after mid+1 
            if(array[mid] > array[mid+1]) {
                end = mid;
            }
            // check the array[mid] < array[mid+1] if it is true then move the start to mid+1
            else if(array[mid] < array[mid+1]){
                start = mid + 1;
            }
        }
        return start; // return start Or return end
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Mountain array 
        int[] array = {1,2,3,4,5,3,1};
        // passing and printing the return value
        System.out.print(search(array));
    }
}
