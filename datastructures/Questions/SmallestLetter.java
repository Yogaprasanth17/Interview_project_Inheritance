package Questions;

import java.util.*;

/*
 *  Q => Return the smallest character in letters that is lexicographically greater than target.
 *       If such a character does not exist, return the first character in letters.
 *       (which means return the smallest character > target so it is (ceiling))
 *  Line 32 :
 *      -> if target is greater than the array then we want to return the first character in that array
 *      -> so we use modulo operator if the target is not found then the start will be at the length of the array 
 *  Example :
 *          array ={c, i, j} target = z
 *          there is no element greater and smaller to the target ie.(smallest character > target)
 *      pointers =>    start   mid    end   |                      |  target > array[1]
 *      index    =>       0      1      2   |  mid = (0+2)/2 = 1   |   z > i    
 *      elements =>       c      i      j   |                      |  start = mid + 1  (1 + 1 = 2)
 * 
 *      pointers =>                 start & end   |                      |  target > array[2]
 *      index    =>       0      1      2         |  mid = (2+2)/2 = 2   |   z > j    
 *      elements =>       c      i      j         |                      |  start = mid + 1  (2 + 1 = 3) now it is equal to length
 *      if the character is greatest than the array elements then in the end of the while loop the start = length 
 *      so if we module the start and length of the array we can retrun the first character of the array
 *      start = 3, length = 3
 *      array[start % array.length] 
 *      array[3 % 3] = array[0] 
 */ 

public class SmallestLetter {
        // User-defined method(non-static)
        // char return type
        public char nextGreatestLetter(char[] charArray, char target) {
            int start = 0;
            int end = charArray.length - 1;
            // loop to iterate
            while (start <= end) {
                int mid = start+(end-start)/2;  // finding the middle index
                // we know that target < mid then the target is going to lies over between start and mid so move the end
                if(target < charArray[mid]) {
                    end = mid - 1;
                }
                // else it lies over mid and end so move the start  
                else {
                    start = mid+1;
                }
            }
            // we want to return the smallest character > target 
            // else return the fist character of the array
            // so use the modulo(%) to return and character index  and fisrt character
            return charArray[start % charArray.length];   
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Creating the object for the main class
            SmallestLetter smallestLetter = new SmallestLetter();
            // reading the size of the array
            System.out.println("Enter the size of character array :");
            int size = sc.nextInt();
            // reading the array elements
            System.out.println("Enter the character elements :");
            char[] charArray = new char[size];
            for (int i = 0; i < size; i++) {
                charArray[i] = sc.next().charAt(0);
            }
            // reading the target 
            System.out.println("Enter the target element :");
            char target = sc.next().charAt(0);
            // array and target are passed as argument to the non-static method
         System.out.println("The next greatest letter is : "+smallestLetter.nextGreatestLetter(charArray, target));
        }  
}