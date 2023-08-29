package Pattern;

/*
o/p             row  col
       *         1    1
      * *        2    2
     * * *       3    3
    * * * *      4    4
   * * * * *     5    5  = num
    * * * *      6    4
     * * *       7    3
      * *        8    2
       *         9    1

       * here in the above patter 
       * the row = col when row < num
       * the col get decress when row > num
       * for space num - row
 */

public class FullDiamond {
    
    public static void main(String[] args) {
        int num = 5;

        // make the outter loop to given patter row count
        for (int row = 1; row <= 2 * num - 1; row++) {
            // check for col loop 
            int colToRun = (row > num) ? 2 * num - row : row;
            // print the space 
            int noOfSpace = num - colToRun;
            for (int space = 1; space <= noOfSpace; space++) {
                System.out.print(" ");
            }
            // make the inner loop to run as per the column elements
            for (int col = 1; col <= colToRun; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
