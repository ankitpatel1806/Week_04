package queueinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
public class BinaryNumberTest {
    @Test
    public void testGenerateBinaryNumbers() {
        BinaryNumbers generator = new BinaryNumbers();
        List<String> result = generator.generateBinaryNumbers(5);
        assertEquals(List.of("1", "10", "11", "100", "101"), result);
        result = generator.generateBinaryNumbers(0);
        assertTrue(result.isEmpty());
        result = generator.generateBinaryNumbers(1);
        assertEquals(List.of("1"), result);
        result = generator.generateBinaryNumbers(10);
        assertEquals(List.of("1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010"), result);
    }
}
