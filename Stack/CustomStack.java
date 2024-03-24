package Stack;

import java.util.Arrays;

class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    CustomStack() {
        this(DEFAULT_SIZE);
    }
    CustomStack (int size) {
        this.data = new int[size];
    }

    public boolean push(int val) {
        if (isFull()) {
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }
    public boolean isFull() {
        return ptr == data.length - 1; // if the prt is equal to length of the array data then we cannot add the value in it 
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
    public int pop() {
        /*
         *  int value = data[ptr];
         *  ptr--;
         *  return value;
         */
        return data[ptr--];
    }
    public int peek() {
        return data[ptr];
    }
}