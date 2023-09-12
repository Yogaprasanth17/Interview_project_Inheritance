package Search;
import java.util.Arrays;

// row wise sorted and col wise sorted 

public class RowandCol {
    public static void main(String[] args) {
        int[][] a = {
       
        // {2,8},
        // {3,9},
        // {2,5,8,12,19},
        // {3,6,9,16,22},
        // {10,13,14,7,24},
        // {18,21,23,26,30}
    };
    int t = 4;
    System.out.println(Arrays.toString(search(a,t)));
    }

    static int[] binary(int[][]a,int r,int rs,int re,int t){
        while(rs<=re){
            int m = rs + (re - rs)/2;
            if(a[r][m]==t){
                return new int[]{r,m};
            }
            if(t > a[r][m]){
                rs = m + 1;
            }
            else {
                re = m - 1; 
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] a, int t) {
        int r = 0;
        int c = a[0].length - 1;
        if(a.length == 1){
           return binary(a, 0, 0, a.length-1, t);
        }
        while(r < a.length && c>=0){
            if (a[r][c]==t) {
                return new int[]{r,c};
            }
            if ((r < a[0].length && c>=0) && t > a[r][c]) {
                r++;
            }
            if ((r < a[0].length && c>=0) && t < a[r][c]) {
                c--;
            }
        }
             return new int[]{-1,-1};
    }
}
