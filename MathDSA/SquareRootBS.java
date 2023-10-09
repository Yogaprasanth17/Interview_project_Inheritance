package MathDSA;

/*
 *  Find the square root for a number 
 *  Note :
 *      - we know that the square root of the number will lies between 0  - that number 
 *      - by using Binary search (because it is sorted) we can find the perfect square root of the number
 */

public class SquareRootBS {
    public static void main(String[] args) {
        int num = 40;
        System.out.printf("%.3f",sqrt(num,3));
    }
    static double sqrt(int num,int p) {
        double root = 0.0;
        int s = 0;
        int e = num;
        while(s <= e) {
            int m = s + (e - s)/2;
            // chech that middle * middle is equal to the number if it return  
            if (m * m == num) {
                return m;
            }
            // if the middle * middle is > numbber then the number will lies between the start and middle so move the "end"     
            if (m  * m > num) {
                e = m - 1;
            }
            // else move the start
            else{
                s = m + 1;
            }
        }
        // if it is not a perfect square (it's will have a precision)
        double icr = 0.1;
        // so run the loop till the precision
        // initialzie root = 0.0 and add with 0.1 
        for (int i=0;i<p;i++){
            while(root * root <= num){
                root += icr;
            }
            // we know that the root will be the - of that number
            root -= icr;
            // to make the 0.1 to 0.01 and 0.001 and so on....
            icr/=10;
        }
        return root;
    }
}
