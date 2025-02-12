package queueinterface;
public class CircularBuffer {
    private int[] buffer;
    private int size;
    private int front, rear, count;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        front = rear = count = 0;
    }

    public void insert(int value) {
        if (count == size) {
            front = (front + 1) % size;
        } else {
            count++;
        }

        buffer[rear] = value;
        rear = (rear + 1) % size;
    }

    public void printBuffer() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.printBuffer();
        buffer.insert(4);
        buffer.printBuffer();
    }
}
