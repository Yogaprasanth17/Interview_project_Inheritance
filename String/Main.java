package String;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "H1e was0 t3he Bo2y";
        String[] ch = str.split(" ");
        String[] s = str.split("\\P{Digit}+");
        
        for (int i = 0; i < ch.length; i++) {
            for (int j = 1; j < s.length; j++) {
                if(Integer.toString(i).equals(s[j])) {
                    char[] c = ch[j-1].toCharArray();
                    for(int k=0;k<c.length;k++){
                        if(Character.isLetter(c[k])) {
                            System.out.print(c[k]);
                        }
                    }
                    System.out.print(" ");
                }
            }
        }
    }
}
