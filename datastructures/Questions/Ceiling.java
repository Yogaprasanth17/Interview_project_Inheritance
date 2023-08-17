package Questions;

import java.util.*;

/*
 *  Q => Ceiling of a number 
 *  -> Ceiling means return the index of " smallest no >= target " 
 *  -> Follow the concept that used in binary search 
 *  -> (Assending order)
 *  Working :                                                                      array[0]      target     array[size - 1]
 *      -> (1)we know that if target is present in the array then it will lies between (start      (answer)        end)                                                                     
 *     
 *      -> (2)(ceiling) if target is not present in the array then it must be lies over (end (answer) start)
 * 
 *      Example if the not present in the array :
 *          -> array[] ={2, 3, 5, 9, 14, 16, 18}
 *          -> target = 15
 *          -> at initial the "start" is array[0] = 2 and "end" is array[size - 1] = 18 and "middle" is array[mid] = 9
 *          -> now the target is > array[mid] i.e (15 > 9)                                                    
 *          -> So now we know that the element is present in between the array[mid] and array[end] i.e (9 to 18)
 *          -> then move the start i.e (start = mid + 1)
 *          -> now array[start] = 14 and array[mid] = 16 and array[end] = 18 and their startIndex = 4 and midIndex = 5 and endIndex = 6
 *          -> mid = (start + end)/2  = (4+6)/2 => 10/2 => 5 (mid = 5)
 *          -> now target < array[mid] i.e (15 < 16) so we want to move the end so (end = mid - 1)
 *          -> now the start and end will be pointing same element/index and mid also. now (target > array[mid]) i.e (15 > 14)
 *          -> then move the start i.e (start = mid + 1)
 *          -> now the start and end is converted like (Working :: 2) now the start will be pointing to the smallest number >= target
 *          -> return the start
 *          
 *      pointers =>    start   mid    end   |                      |  target < array[5]
 *      index    =>       4      5      6   |  mid = (4+6)/2 = 5   |   15 < 16    
 *      elements =>      14     16     18   |                      |  end = mid - 1 
 *       
 *      "Note : here the start and end pointer points the same element/index"
 *      pointers =>  start & end & mid             |                      |  target > array[4]
 *      index    =>       4             5      6   |  mid = (4+4)/2 = 4   |   15 > 14    
 *      elements =>      14            16     18   |                      |  start = mid + 1        
 *      
 *      pointers =>     end    start        |                      |     now start will be pointing to the
 *      index    =>       4      5      6   |  while loop break    |        (smallest no >= target) 
 *      elements =>      14     16     18   |                      |            16 >= 15       
 *              
 *              In the above array elements 16, 18 are >= 15 but we want "smallest no >= target" so 16 is >= 15 
 */         


public class Ceiling {

    public static int ceiling(int[] array, int target) {
        // Initializing  start and end 
        int start = 0;
        int end = array.length - 1;

        // return -1 when the array size = 0 (or) if the target is > the last element in the array
        if(array.length == 0 || target > array[array.length -1]) {
            return -1;
        }
        
        // Loop to iterate 
        while (start <= end) {
            // finding the middle element of the array
            int mid = start + (end - start)/2;
            // return index when target = array of the middle element 
            if(target == array[mid]) {
                return mid;
            }
            // target < array of the middle element move the position of the end 
            if(target < array[mid]) {
                end = mid - 1;
            }
            // target > array of the middle element move the position of the start
            else {
                start = mid + 1;
            }
        }
        return start;  // we want to find the exact index (or) return the index of the smallest number >= target  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        System.out.println("Enter the size of the array :");
        int size = scanner.nextInt();

        // Reading the array elements
        System.out.println("Enter the elements :");
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = scanner.nextInt();
        }

        // Reading the target element to search
        System.out.println("Enter the tat element :");
        int target = scanner.nextInt();

        // Array and target is passed as the parameter to user-definded method
        System.out.println("The element is present in this index : "+ceiling(array,target)); 
    }
}
