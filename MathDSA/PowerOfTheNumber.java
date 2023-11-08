package MathDSA;

public class PowerOfTheNumber {
    public static void main(String[] args) {
        int number = 1;
        int base = 2;
        System.out.print(isPower(number,base));
    }

    static Boolean isPower(int number, int base) {
        return (Math.log(number)/Math.log(base)) % 1 == 0;
    }

}