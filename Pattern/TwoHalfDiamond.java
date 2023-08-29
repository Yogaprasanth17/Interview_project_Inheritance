package Pattern;
/*
            *      *
            **    **
            ***  ***
            ********
            ***  ***
            **    **
            *      *
 */
public class TwoHalfDiamond {
    public static void main(String[] args) {
        int num = 4;
        for (int row = 1; row <= 2 * num - 1; row++) {
            int colToRun = (row>num)? 2 * num - row: row;
            int sp = num - colToRun;
            for (int col = 1; col <= colToRun; col++) {
                System.out.print("*");
            }
            for(int space = 1; space <= sp; space++){
                System.out.print("  ");
            }
            for (int col = 1; col <=colToRun ; col++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
