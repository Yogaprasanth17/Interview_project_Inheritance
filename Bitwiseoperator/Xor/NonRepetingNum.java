package Bitwiseoperator.Xor;

// Find the non-repeted number in an array

public class NonRepetingNum {
    public static void main(String[] args) {
         int[] a = {2,3,4,3,2,6,4};
         System.out.println(ans(a));
    }

     static int ans(int[] array) {
        int unique = 0;
        for (int i : array) {
            unique ^= i;
        }
        return unique;
    }
}
