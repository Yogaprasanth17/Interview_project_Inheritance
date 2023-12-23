package Recursion.pattern;

//   *
//   **
//   ***
//   ****
//   *****

public class LowerTriangle {
    public static void main(String[] args) {
        int n = 5;
        triangle(n,0);
    }
    static void triangle(int r,int c) {
        if (r == 0) {
            return;
        }
        if (r != c) {
            triangle(r, c+1);
            System.out.print("*");
        }                    
        else {
            triangle(r-1, 0);
            System.out.println();
        }    
    }
}
