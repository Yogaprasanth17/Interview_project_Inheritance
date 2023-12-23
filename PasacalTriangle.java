import java.util.*;
public class PasacalTriangle
{
	public static void main(String[] args) {
		int n = 5;
		int[][] a = new int[n][n];
		for (int i=0;i<n;i++) {
		    for (int j=0;j<i+1;j++) {
		        a[i][j] = 1;
		    }
		}
		
		
		for (int i=2;i<n;i++) {
		    for (int j=0;j<i+1;j++) {
		        int[] arr = fun(a[i-1],i+1);
		        for (int k=0;k<arr.length;k++) {
		            a[i][k] = arr[k]; 
		        }
		    }
		}
		for (int i=0;i<n;i++) {
		    for (int j=0;j<i+1;j++) {
		        System.out.print(a[i][j] + " ");
		    }
		    System.out.println();
		}

	}
	
	static int[] fun(int[] a,int n) {
	    int[] b = new int[n];
	    b[0] = 1;
	    for (int i=1;i<n-1;i++) {
	        b[i] = a[i-1]+a[i];
	    }
	    b[n-1] = 1;
	    return b;
	}
	
}
