package MathDSA;

public class PrimeBtwNumber {

    /*
        if the num = 20
        { 1 * 20 = 20
         2 * 10 
         4 * 5 } 
        { 5 * 4
         10 * 2
         1 * 20 }
         here the number are repeting so we can run the loop till square root of the num (Line : 26)
     */

    public static void main(String[] args) {
        int num = 20;
        for (int i=1;i<=num;i++) {
            System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
