public class matches {
    
    /*
     *  matches method used to check the String matches the other String
     */

    public static void main(String[] args) {
        String str = "appleApples"; // o/p = a e A E
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++) {
            String t = Character.toString(ch[i]);
            if(t.matches("[aeioAEIOU]")) {
                System.out.print(ch[i] + " ");
            }
        }
    }
}
