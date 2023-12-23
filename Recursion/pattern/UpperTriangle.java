package Recursion.pattern;

//   *****
//   ****
//   ***
//   **
//   *

public class UpperTriangle {
    public static void main(String[] args) {
        int n = 5;
        triangle(n,0);
    }
    static void triangle(int r,int c) {
        if (r == 0) {
            return;
        }
        if (r != c) {
            System.out.print("*");
            triangle(r, c+1);
        }                    
        else {
            System.out.println();
            triangle(r-1, 0);
        }    
    }
}
