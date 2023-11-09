public class XorOfNum {
    /*
     *  Q : Find the xor of the num from the range 0 - n
     *      0 0
     *      1 0^1 = 1
     *      2 0^1^10 = 3
     *      3 0^1^2^3 = 0
     *      4 0^1^2^3^4 = 4
     *      5 0^1^2^3^4^5 = 1
     *      6 0^1^2^3^4^5^6 = 7
     *      7 0^1^2^3^4^5^6^7 = 0
     *      8 0^1^2^3^4^5^6^7^8 = 8
     *      9 0^1^2^3^4^5^6^7^8^9 = 1
     */
    public static void main(String[] args) {
        int num = 4;
        if (num % 4 == 0) {
            System.out.print(num);
        }    
        else if (num % 4 == 1) {
            System.out.print(1);
        }
        else if (num % 4 == 2) {
            System.out.print(num+1);
        }
        else if (num % 4 == 3) {
            System.out.print(0);
        }
    }
}
