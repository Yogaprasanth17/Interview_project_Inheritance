package Bitwiseoperator.And;

// Finding the given number is odd or even

public class OddOrEven {
    public static void main(String[] args) {
        int num = 88;
       System.out.println(isEven(num));
    }

    static boolean isEven(int num) {
        return (num & 1)==0;
    }
}
