package Recursion;

import java.util.*;

/*
 * fibonacci number using recursion 
 * we use the formula to find the n'th fibonacci number
 * formula = fibonacci(number - 1) + fibonacci(number - 2)
 * In this return type is important
 * fibonacci -> method name
 * number -> user enetered number
*/

public class Fibonacci {
     // Recursion method
    static int fibonacci(int number) {
        if(number < 2) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

     // Main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n'th number to find the fibonacci number : ");
        // Reading the number from the user
        int number = sc.nextInt(); 
        // Storing the returned number from the recursion method
        int answer = fibonacci(number); 
        System.out.println("The fibonacci number is : "+answer);
    }
}