package Pattern;

/*
            **********
            ****  ****
            ***    ***
            **      **
            *        *
            *        *
            **      **
            ***    ***
            ****  ****
            **********

 */

public class DiamondInSquare {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 1; row <= 2*num; row++) {
            int colToRun = (row>num) ? 2*num - row : row-1;
            int sp = (num-colToRun);
            for (int i = 1; i <= sp; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= colToRun; i++) {
                System.out.print("  ");
            }
            for (int i = 1; i <= sp; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
