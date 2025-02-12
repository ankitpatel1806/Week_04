package queueinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CircularBufferTest {

    @Test
    public void testCircularBuffer() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.printBuffer();

        buffer.insert(4);
        buffer.printBuffer();
    }
}
