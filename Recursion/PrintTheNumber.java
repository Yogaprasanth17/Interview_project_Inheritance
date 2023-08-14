package Recursion;

import java.util.*;

/*
 * -> Working <-
 * -> The Scanner read the number from the user 
 * -> And the number is passed as an argument to the print method
 * -> And in print method we have a if condition to check weather it is equal to zero
 * -> And then the "recursion" process takes place
 * -> While the recursion process takes place the methods are stored in the stack
 * -> When the number gets equal to zero then all the method from the stack are got removed one by one 
 * -> So it print the number in correct way 
 * 
 * -> Example
 *  -> number = 5
 *  -> print(5) calls print(5 - 1) -|
 *  -> print(4) calls print(4 - 1)  |   All this methods are now stored in stack
 *  -> print(3) calls print(3 - 1)  |   While the method encounters the "return" statement 
 *  -> print(2) calls print(2 - 1)  |   Then all the methods from the stack is get out from the stack
 *  -> print(1) calls print(1 - 1)  |   In this way  fun(1) -> fun(2) -> fun(3) -> fun(4) -> fun(5)
 *  -> print(0) return             -|   
*/

    // Printing the numbers form 1 to n 
public class PrintTheNumber {
        // Recursion method
    static void print(int number){
        // If the number is zero then it return
        if(number == 0){
            return;
        }
        print(number - 1); // Calls the function it's self
        System.out.print(number+" "); // Then the print statement print the number 
    }
        // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading the number from the user 
        int number = sc.nextInt();
        // Calling the recursion method
        print(number);
    }
}