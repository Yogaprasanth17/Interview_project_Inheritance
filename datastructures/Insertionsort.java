package datastructures;
import java.util.*;
public class Insertionsort{
    public static void printTheSortArray(int[] array){
        System.out.println("The final sorted array in assending order: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void swap(int[] array,int a,int b){
        for (int i = 0; i < array.length ;i++){
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }
    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i+1; j > 0; j--){
                if( array[j] < array[j-1] ){  // the given condition is for assending order
                    swap(array,j,j-1);          // the condition for descending order if( array[j] > array[j-1])
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < size; i++){
                array[i] = sc.nextInt();
            }
            insertionSort(array);
            printTheSortArray(array);
    }
}
