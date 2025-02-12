package listinterface;
import java.util.*;

public class NthElementFromEnd {
    public static <T> T find(LinkedList<T> list, int n) {
        if (n <= 0 || n > list.size()) {
            throw new IllegalArgumentException("Invalid position");
        }
        ListIterator<T> backwardIterator = list.listIterator(list.size());
        for (int i = 0; i < n; i++) {
            backwardIterator.previous();
        }
        return backwardIterator.next();
    }
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        String nthElement = find(linkedList, 2);
        System.out.println("Nth Element from the End (N=2): " + nthElement);
    }
}
