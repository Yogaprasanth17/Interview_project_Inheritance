package Pattern;
public class NumberPattern {
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
