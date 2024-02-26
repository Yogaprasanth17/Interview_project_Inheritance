package SubSequence.practice;

public class SkipAInTheString {
    public static void main(String[] args) {
        SkipAInTheString skipAInTheString = new SkipAInTheString();
        String str = "baccad";
        System.out.print(skipAInTheString.removeA("",str));
    }
    public String removeA(String p,String str) {
        if (str.isEmpty()) {
            return p;
        }
        if (str.charAt(0) == 'a') {
           return removeA(p, str.substring(1));
        }
        return removeA(p+str.charAt(0), str.substring(1));
    }
}
