package Stack;

import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) {

        // CustomStack stack = new CustomStack(5); // static stack
        DynamicStack stack = new DynamicStack(); // Dynamic stack 
        for (int i=1;i<=100;i++) {
            stack.push(i);
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(stack.data, 0, stack.ptr+1)));
    }
}
