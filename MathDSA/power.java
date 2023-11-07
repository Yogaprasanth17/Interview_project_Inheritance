package MathDSA;

public class power {
    public static void main(String[] args) {
        int base = 2;
        int power = 10;
        int ans = 1;

        while (power != 0) {
            if ((power & 1)==1) { // if the bit is 1
                ans = ans * base; // ans = 1 * 3
            }
            base = base * base;  // 3 * 3 multiplying the base 
            power = power >> 1;  // power = 110 >> 1
        }
        System.out.print(ans);
    }
}
