package Pattern;


/*

        1 1 1 1 1 1 1
        1 2 2 2 2 2 1
        1 2 3 3 3 2 1
        1 2 3 4 3 2 1
        1 2 3 3 3 2 1   if the given number is not subtracted from the minimum 
        1 2 2 2 2 2 1
        1 1 1 1 1 1 1

        4 4 4 4 4 4 4       
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4
        4 3 2 1 2 3 4   if the given number is subtracted from the minimum 
        4 3 2 2 2 3 4
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4


        FIND THE MINIMUM OF THE EACH INDEX:
        LEFT = COL                  UP = ROW
        RIGHT = 2 * NUM - COL       DOWN = 2 * NUM - ROW 
        FIND THE MINIMUM AND SUBTRACT FROM THE GIVEN (NUMBER + 1)
 */

public class Sprial
{
	public static void main(String[] args) {
		int num = 4;
		for (int row = 1; row <= 2*num - 1; row++) {
		    for (int col = 1; col <= 2*num - 1; col++){
		        int answer = (num + 1) - Math.min(Math.min(col, 2*num - col),Math.min(row,2*num - row));
		        System.out.print(answer+" ");
		    }
            System.out.println();
		}
	}
}

