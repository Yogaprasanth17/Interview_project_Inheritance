package Pattern;

public class HalfDiamond {

/*
    
 O/P

            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *

 */

    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {
            int t = num - row; 
            int sp = t  - row;
            for (int space = 1; space <= t; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}















