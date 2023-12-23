package Recursion;
   
public class StringPalindrome {
     static String ans = "";
    public static void main(String[] args) {
        String str = "malayalam";
        reverse(str,str.length()-1);
        System.out.print(str + " " + "is Palindrome" + ": "+ans.equals(str));
    }
    static void reverse(String str,int i) {
        if (i < 0) {
            return;
        }
        char t = str.charAt(i);
        ans += t;
        reverse(str, --i);
    }
}
