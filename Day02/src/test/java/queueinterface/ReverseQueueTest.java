package queueinterface;
import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class ReverseQueueTest {

    @Test
    public void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        ReverseQueue.reverseQueue(queue);
        List<Integer> expected = Arrays.asList(30, 20, 10);
        assertEquals(expected, new ArrayList<>(queue));
    }
    @Test
    public void testReverseQueueEmptyQueue() {
        Queue<Integer> queue = new LinkedList<>();
        ReverseQueue.reverseQueue(queue);
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testReverseQueueSingleElementQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        ReverseQueue.reverseQueue(queue);
        List<Integer> expected = Arrays.asList(10);
        assertEquals(expected, new ArrayList<>(queue));
    }
}