package MathDSA;

public class NumberIsPrime {

    /*
        if the num = 36
    {   
        1 * 36 = 36
        2 * 18
        3 * 12
        4 * 9
    }
        6 * 6
    {    
        9 * 4
        12 * 3
        18 * 2
        36 * 1
    }
        here the number are repeting so we can run the loop till square root of the num (Line : 26)
        2 * 18 = 36
        also 
        18 * 2 = 36
        so we run the loop till the square root of the num
     */
    public static void main(String[] args) {
        int num = 9;
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int num) {
        if(num<=1) {
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}