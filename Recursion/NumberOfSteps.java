package Recursion;

/*
 *  Q: Number of Steps to Reduce a Number to Zero
 *  Given an integer num, return the number of steps to reduce it to zero.
 *  In one step, if the current number is even, you have to divide it by 2, 
 *  otherwise, you have to subtract 1 from it.
 */

public class NumberOfSteps
{
	public static void main(String[] args) {
	    System.out.print(numberOfSteps(8));
	}
	static int numberOfSteps(int num) {
        return helper(num,0);
    }
    static int helper(int num,int c) {
        if (num == 0) {
            return c;
        }
        if (num % 2 == 0) {
            return helper(num/2,c+1);
        }
        return helper(num-1,c+1);
    }
}