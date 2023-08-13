package datastructures;

import java.util.*;

public class Cyclesort {

        public static void swap(int[] array,int index,int currentIndex) { 
            int temp = array[index];
            array[index] = array[currentIndex];
            array[currentIndex] = temp;
        } 
    
        public static void cyclicSort(int[] array,int size){
            int index = 0;
            while (index < size) {
            int currentIndex = array[index] - 1;
                if(array[index] != array[currentIndex]) {
                    swap(array, index, currentIndex); 
                }
                else {
                    index++;
                }
        }

        }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i  < size; i++) {
            array[i] = sc.nextInt(); 
        }
        cyclicSort(array,size);
        System.out.println("The final sorted array: ");
        System.out.println(Arrays.toString(array));
     }
}