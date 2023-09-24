package Search;
import java.util.Arrays;

// sorted matrix 

public class TwoDArray {
    public static void main(String[] args) {
        int[][] a = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
       };
        int[] ans = skip(a, 2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] a,int r,int cs,int ce,int t) {
       while(cs<=ce){
        int m = cs + (ce - cs)/2;
        if(a[r][m]==t){
            return new int[]{r,m};
        }
        if(t>a[r][m]){
            cs = m + 1;
        }
        else {
            ce = m - 1;
        }
       }
       return new int[]{-1,-1};
    }

    private static int[] skip(int[][] a, int t) {
        int row = a.length;
        int col = a[0].length;
        if(row == 1){
            return search(a,0,0,col-1,t);
        }
        int rs = 0;
        int re = a.length - 1;
        int mc = col/2;
        while(rs < (re-1)){
            int m = rs + (re - rs)/2;
            if(a[m][mc]==t){
                return new int[]{m,mc};
            }
            if(t > a[m][mc]){
                rs = m;
            }
            if(t <= a[m][mc]){
                re = m;
            }
        }
        if(a[rs][mc]==t){
            return new int[]{rs,mc};
        }
        if(a[rs+1][mc]==t){
            return new int[]{rs+1,mc};
        }
        if(mc-1 >= 0 && t <= a[rs][mc-1]){
            return search(a, rs, 0, mc - 1, t);
        }
        if(mc+1 <= col-1 && t >= a[rs][mc+1] && t<=a[rs][col-1]){
            return search(a, rs, mc+1, col-1, t);
        }
        if(mc-1 >= 0 && t <= a[rs+1][mc-1]){
            return search(a, rs+1, 0, mc-1, t);
        }
        if(mc+1 <= col-1 && t >= a[rs+1][mc+1] && t<=a[rs+1][col-1]){
            return search(a, rs+1, mc+1, col-1, t);
        }
        return new int[]{-1,-1};
    }
}
