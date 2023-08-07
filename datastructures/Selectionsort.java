package datastructures;

import java.util.*;

public class Selectionsort {
    public static void printTheArray(int[] arrry,int size){
        System.out.println("The final sorted array: ");
        for (int i = 0; i < size; i++){
            System.out.print(arrry[i]+" ");
        }
    }
    public static void swap(int[] array,int a,int b){
        for (int i=0; i < array.length; i++){
            int temp =  array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }
    public static void sortTheArray(int[] array,int size){
        for (int i = 0; i < size - 1; i++){
            int minimum = array[i];
            int index = i;
            for (int j = i+1; j < size; j++){
                if (array[j] < minimum){
                    minimum = array[j];
                    index = j;
                }
            }
            swap(array,i,index);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the arrry size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        sortTheArray(array,size);
        printTheArray(array,size);


    }
}
