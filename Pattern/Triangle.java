package Pattern;

/*
    TRICK:
      * the outter loop should the count of the row
      * identify for every row number that how many col are there
            ie. for each row count the col element and that will be the inner loop

o/p
    col   row    
     5     1   + + + + +
     4     2   + + + + 
     3     3   + + + 
     2     4   + + 
     1     5   +  

     here in the above example :
           * row count where 1 2 3 4 5
           * and row 1 has 5 col
           * and row 2 has 4 col
           * and row 3 has 3 col
           * and row 4 has 2 col 
           * and row 5 has 1 col

 */

 public class Triangle {

    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {

            // to minimize the column 
            int colToRun = (num - row) + 1;

            for (int col = 1; col <= colToRun; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 }