package Bitwiseoperator.Leftshift;

// find the i'th bit of the number

public class FindTheNthBit {
    public static void main(String[] args) {
        int n = 10; // 10 in binary form is = 1010
        int i = 4; // get the 4 bit 1010 4'th bit is 1
        // to find the i'th bit of the number right shift the other bit and & with 1
        System.out.println(n>>(i-1)&1);

    }
}
