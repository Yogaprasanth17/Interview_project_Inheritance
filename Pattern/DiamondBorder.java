package Pattern;

public class DiamondBorder {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=n-i;j<n;j++) {
                if(i==n || j==n-i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int j=2;j<=i;j++) {
                if(i==n || j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
           
    }
}
