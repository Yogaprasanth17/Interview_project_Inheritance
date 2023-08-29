package Pattern;
/*                                  row
                    1                1
                  2 1 2              2
                3 2 1 2 3            3
              4 3 2 1 2 3 4          4       
            5 4 3 2 1 2 3 4 5        5
              4 3 2 1 2 3 4          6
                3 2 1 2 3            7
                  2 1 2              8
                    1                9

                    Here the outter loop runs 2 * num - 1 times
                    after when row gets > num then the numbers in the numbers in the patter gets decressing 
                    like (2 * n) - row ie. 10 - 6 = 4 where in the 8th line its follows  
 */
public class NumberDiamond {
    public static void main(String[] args) {
        int num = 5;
        
        for (int row = 1; row <= 2 * num - 1; row++) {
            // ckeck to column start
            int colStart = (row > num) ? (2 * num) - row : row;
            // for space
            int sp = num - colStart;
            for (int space = 1; space <= sp; space++) {
                System.out.print("  ");
            }

            for (int col = colStart; col >= 1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= colStart; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
