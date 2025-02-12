package queueinterface;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class BinaryNumbers {

    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();

        if (N <= 0) {
            return result;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Generate N binary numbers
        for (int i = 0; i < N; i++) {
            String current = queue.poll();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryNumbers generator = new BinaryNumbers();
        List<String> binaryNumbers = generator.generateBinaryNumbers(5);
        System.out.println(binaryNumbers);
    }
}
