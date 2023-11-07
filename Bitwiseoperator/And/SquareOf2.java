package Bitwiseoperator.And;
/*
    1
    2 
    4 
    8
    square of 2
    if the (number & previous number == 0) is the square of 2
 */
public class SquareOf2 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                //print square of 2 System.out.println(i);
                System.out.print(i + " ");
                sum -= i;
            } else {
                sum += i;
            }
        }
        // System.out.println(sum);
    }
}





