package MathDSA;

// gcd using recursion  

public class Gcd {
    public static void main(String[] args) {
        int x = 10, y = 25; // o/p = 14
        System.out.print(gcdNum(x,y));
        // System.out.print(lcmNum(x,y));
    }

     static int lcmNum(int x, int y) {
        // the least number which divided by both x and y
        /*
         * formula : LCM = a * b / gcd(a,b)
         */
        return (x * y) / gcdNum(x , y) ;
    }

    static int gcdNum(int a,int b) {
        // here b % a and "a" is passed as a parameter because "b" is % by "a" so "a" will become 0 
        if(a == 0) {
             return b;
        }
        return gcdNum((b%a), a);
    }

}
