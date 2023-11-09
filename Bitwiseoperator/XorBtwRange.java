public class XorBtwRange {
    /*
     *   Q : Find the xor between the range a and b
     *     
     *      WORKING : 
     *          first find the xor of a-1 ^ b
     *          ans = f(a-1) ^ f(b)
     *          if a = 3 find the xor form 0-(3-1) where it's = 0 to 2 so f(a) = 0^1^2(3-1)
     *          if b = 9 find the xor form 0-b where it's = 0 to 9 so f(b) = 0^1^2^3^4^5^6^7^8^9    
     *           
     *          0^1^2^3^4^5^6^7^8^9 
     *          |---| |-----------|
     *          (a-1)      (b)
     */
    public static void main(String[] args) {
        int a = 3, b = 9;
        int ans = xorOfNum(a-1) ^ xorOfNum(b);
        System.out.println(ans);
    }
    static int xorOfNum(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a+1;
        }
        // if (a % 4 == 3) {
        //     return 0;
        // }
          // (OR)
          return 0;
    }
}
