package Permutaion_Recursion;

import java.util.*;

public class StringPermutaion {
    public static void main(String[] args) {
        StringPermutaion stringPermutaion = new StringPermutaion();
        String up = "abc";
        // stringPermutaion.stringPremut("", up);
        // System.out.println(stringPermutaion.stringPremutList("", up));
        System.out.println(stringPermutaion.stringPremutCount("",up));
    }
    public void stringPremut(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            stringPremut(f + ch + s, up.substring(1));
        }
    }
    public List<String> stringPremutList(String p,String up) {
        if (up.isEmpty()) {
            List<String> in = new ArrayList<>();
            in.add(p);
            return in;
        }
        List<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            list.addAll(stringPremutList(f + ch + s, up.substring(1)));
        }
        return list;
    }
    public int stringPremutCount(String p,String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int c = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            c = c + stringPremutCount(f + ch + s, up.substring(1));
        }
        return c;
    }
}
