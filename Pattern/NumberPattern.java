package Pattern;
public class NumberPattern {

    /*
        1 7 12 16 19 21 
        2 8 13 17 20
        3 9 14 18
        4 10 15
        5 11
        6
     */
    public static void main(String[] args) {
        int n = 6;
        int t = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(t+" ");
               t+= n-j+1;
            }
            t = i+2;
            System.out.println();
        }
    }
}
