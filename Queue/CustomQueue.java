package Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    CustomQueue() {
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) {
        if (isFull()) {
            return false;
        }
        data[end++] = val;
        return true;
    }
    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int val = data[0];
        for (int i=1;i<end;i++) {
            data[i-1] = data[i];
        }
        data[end-1] = 0;
        end--;
        return val;
    }
    public boolean isFull() {
        return end == data.length; 
    }
    public boolean isEmpty() {
        return end == 0;
    }
    public int poll() {
        if (isEmpty()) {
            return -1;
        }
        return data[0];
    }
}
