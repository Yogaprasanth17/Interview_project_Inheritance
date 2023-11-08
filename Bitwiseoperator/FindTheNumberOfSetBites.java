public class FindTheNumberOfSetBites {
    /*
     *   where n = n & n-1 
     *      if n = 10, 10 in base 2 is 1010 and the n-1 = 10-1 = 9
     *      n = 10(1010) and n-1 = 9(1001);
     *      by making the (right most setbit) as zero and add a counter  
     *      to find the right most setbit formula : n = n & (n-1) (number and the previous number) 
     * 
     *      WORKING :
     *           n = 10 
     *           step 1 : 1010(10) & 1001(9) = 1000(4) ,c = 1
     *           step 2 : 1000(4) & 11(3) = 0, c = 2
     *              answer = 2
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.println(setBit(n));
    }
    static int setBit(int n) {
        int count = 0;
        while (n!=0) {
            count++;
            n = n & (n-1);
        }                    
        return count;
    }
}
