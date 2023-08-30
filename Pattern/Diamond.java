package Pattern;

/*
    
 O/P

    * * * * * * * * * 
      * * * * * * *
        * * * * *
          * * *
            *

 */

public class Diamond {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 0; row < num; row++) {
            int t = num - row; 
            int sp = row - 1;
            for (int col = 0; col <= sp; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= t; col++) {
                System.out.print("* ");
            }
            for (int col = t; col >= 2; col--) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
