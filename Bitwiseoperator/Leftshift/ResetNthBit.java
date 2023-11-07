package Bitwiseoperator.Leftshift;

public class ResetNthBit {
    public static void main(String[] args) {
        int n = 10;
        int Retset = 2;
        System.out.print(n & (1<<Retset-1)); 
    }
}
