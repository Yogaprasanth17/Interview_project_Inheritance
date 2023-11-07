package Bitwiseoperator.Leftshift;

public class SetTheNthBit {
    public static void main(String[] args) {
        int n = 10; // the binary representation od 10 is 1010
        // if it is "0" -> change it to "1"
        // if it is "1" -> change it to "1"
        // to change the value of 0 -> 1 and 1 -> 1 " | or " with 1
        int setBit = 2; // 2'nd bit is 1 we want to change it to 1
        System.out.println(n|(1<<setBit-1));
    }
}
