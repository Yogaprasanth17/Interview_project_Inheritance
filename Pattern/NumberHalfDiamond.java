package Pattern;


/*                          
                            row     col
                1            1              
              2 1 2          2      here first half is getting incressed
            3 2 1 2 3        3      and second gets decressed
          4 3 2 1 2 3 4      4
        5 4 3 2 1 2 3 4 5    5
 */

public class NumberHalfDiamond {

    public static void main(String[] args) {
        int num = 5;
        for (int row = 1; row <= num; row++) {
            for (int space = 1; space <= num - row; space++) {
                System.out.print("  "); //  give two blank space because we are printing other loops with SPACE
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
