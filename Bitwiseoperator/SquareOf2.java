package Bitwiseoperator;
/*
    1
    2 
    4 
    8
    square of 2
 */
public class SquareOf2 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                //print squar of 2 System.out.println(i);
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}





