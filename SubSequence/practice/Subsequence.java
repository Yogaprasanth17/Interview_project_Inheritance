package SubSequence.practice;

import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        // subSequence("",str);
        // System.out.print(subSeqList("", str));
            subSeqAcii("",str);
        // System.out.println('a'-0);
    }
    static void subSequence(String p,String main) {
        if (main.isEmpty()) {
            System.out.println(p);
            return;
        }
        subSequence(p, main.substring(1));
        subSequence(p+main.charAt(0), main.substring(1));
    }
    static List<String> subSeqList(String p,String main) {
        if (main.isEmpty()) {
            List<String> in = new ArrayList<>();
            in.add(p);
            return in;
        }
        List<String> list = new ArrayList<>();
        list.addAll(subSeqList(p+main.charAt(0), main.substring(1)));
        list.addAll(subSeqList(p, main.substring(1)));
        return list;
    }
    static void subSeqAcii(String p,String main) {
        if (main.isEmpty()) {
            System.out.println(p);
            return;
        }
        subSeqAcii(p+main.charAt(0), main.substring(1));
        subSeqAcii(p, main.substring(1));
        subSeqAcii(p + (main.charAt(0) - 0), main.substring(1));
    }
}
