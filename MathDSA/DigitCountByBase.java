package MathDSA;

public class DigitCountByBase {

    // formula = log(num) / log(base) + 1

    // the program to find the no.of digits of the give number for give base
    // if n = 10 (10 in base 10 is where it contain "2" digits)
    // 10 in base 2 is = 1010 where it contain "4" digits

    // to find the "count" log(n) / log(base)

    public static void main(String[] args) {
        int n = 10;
        int base = 2;
        int ans = 0;
        
        ans = (int) (Math.log(n) / Math.log(base) + 1);
        
        System.out.print(ans);
    }
}
