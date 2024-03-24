package Queue;

import java.util.*;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        for (int i=1;i<=5;i++) {
            queue.push(i);
        }
        System.out.println(Arrays.toString(queue.data));
        queue.remove();
        System.out.println(Arrays.toString(queue.data));
        queue.remove();
        System.out.println(Arrays.toString(queue.data));
    }
}
