package mapinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class InvertMapTest {

    @Test
    public void testInvertMap() {
        InvertMap inverter = new InvertMap();

        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = inverter.invertMap(originalMap);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, Arrays.asList("A", "C"));
        expected.put(2, Collections.singletonList("B"));

        assertEquals(expected, invertedMap);
    }
}

