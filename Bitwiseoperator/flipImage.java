public class flipImage {

    /*
     *  Q : flip the image 
     *  convert [1,0,1] this [0,1,0]
     *  if 0 to 1
     *  if 1 to 0
     */
    public static void main(String[] args) {
        int[][] a = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        for (int i = 0; i < a.length; i++) {
            swap(a[i]);
        }
        for (int[] is : a) {    
            for (int i : is) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
    static void swap(int[] a) {
        int s = 0;
        int e = a.length-1;
        while (s <= e) {
            int t = a[s]  ^ 1;  // xor the first and last element
            a[s] = a[e] ^ 1;
            a[e] = t;
            s++;e--;
        }
    }
}

