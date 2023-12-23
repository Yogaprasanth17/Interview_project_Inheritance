package Pattern;

/*
    1 
    2 5
    3 4 1
    4 3 2 5
    5 2 3 4 1
    
 */

public class NumberPatter1 {

    public static void main(String[] args) {
		//Your Code Here
        int n = 5;
        int t = n,c = 1;
        int co = 1,in = 1;
        int[][] a = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i<=j) {
                a[i][j] = c++;
                }
            }
        }
        c = 1;
        while (co != n) {
            for (int i=in;i<n;i++) {
               if (co % 2 == 0) {
                   a[co][i] = c++; 
               }
               else if (co % 2 != 0) {
                   a[co][i] = t--;
               }
            }
            t = n;
            co++;
            c = 1;
            ++in;
        }
        co = 0;
        while (co != n) {
        for (int i=0;i<n;i++) {
            if (a[i][co] == 0) {
                continue;
            }
            System.out.print(a[i][co] + " ");
        }
        System.out.println();
        co++;
        }
	}
}

