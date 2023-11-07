public class MagicNumber {

    // magic number is the pow of five(5)
    // 5^1 + 5^2 + 5^3 .... 5^n
    // working 
    /*
     * if n = 7
     *  7 in base 2 = 111
     *  "ans","last" initial is = 0
     *  "base" = 1
     *  NOTE:  we are multiplying all the bits with the power of 5
     * 
     *   ex  7 in base 2 : 1*(5^1) + 1*(5^2) + 1*(5^3) = 155
     *   ex 6 in base 2 is 110 : 0*(5^1) + 1*(5^2) + 1*(5^3) = 150 
     *   this process happens left to rigth (in reverse order)
     */
    public static void main(String[] args) {
       int n = 6;
       int last = 0;
       int base = 1;
       int ans = 0;
       while(n!=0) {
        last = n & 1;
        ans += last * Math.pow(5,base);
        n>>=1;;
        base++;
        // base = base * 5;
       }
       System.out.println(ans);
    }
} 
                        //(OR)
// public class Main
// {
// 	public static void main(String[] args) {
// 	    int n = 1;
// 	    int ans = 0;
// 	    int c = 0;
// 	    while (n!=0) {
// 	        c++;
// 	        ans += (n&1) * Math.pow(5,c);
// 	        n>>=1;
// 	    }
// 	    System.out.print(ans);
// 	}
// }