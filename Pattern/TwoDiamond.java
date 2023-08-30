package Pattern;

/*
 
                * * * * * 
                 * * * *  
                  * * *
                   * *
                    *
                    *
                   * *
                  * * *
                 * * * *
                * * * * *

 */

public class TwoDiamond {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 0; row < num; row++) {
            int t = num - row;
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < t; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= num; row++) {
            int t = num - row;
            for (int space = 1; space <= t; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
