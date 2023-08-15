package datastructures;

import java.util.*;

public class Bubblesort {

     static void bubbleSort(int[] array) {
        boolean poll;
        for (int i = 0; i < array.length; i++) {
                poll = false;
            for (int j = 1; j < array.length - i; j++) {
                
                if (array[j] < array[j-1]) {

                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    poll = true;

                }
            }
            if (!poll) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        bubbleSort(array);
        System.out.println("The final sorted array: ");
        System.out.print(Arrays.toString(array));

    }



}
