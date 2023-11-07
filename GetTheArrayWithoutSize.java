import java.util.*;

public class GetTheArrayWithoutSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int size = 0;
        do {
            array[size] = sc.nextInt();
        } while(!sc.hasNextLine());
        System.out.print(Arrays.toString(array));
        // for (int i = 0; i < size;i++) {
        //     System.out.print(array[i]+" ");
        // }
    }    
}
