package Pattern;

/*
 col   row
  1      1    * 
  2      2    * * 
  3      3    * * * 
  4      4    * * * *
  5      5    * * * * *
  4      6    * * * *
  3      7    * * *
  2      8    * *
  1      9    *

        here n = 2 * num - 1 
        * in the first half of the triangle the row and col incress equaly
        * after "num" col gets decress so = total number of row - row here we get the col count
 */

public class HalfTriangle {
    
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= 2 * num - 1; row++) {
            
            int colToRun = (row > num) ? (2 * num) - row : row;

            for (int col = 1; col <= colToRun; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
