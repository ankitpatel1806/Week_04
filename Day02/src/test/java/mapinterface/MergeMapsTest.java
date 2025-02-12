package mapinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MergeMapsTest {

    @Test
    public void testMergeMaps() {
        MergeMaps merger = new MergeMaps();

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = merger.mergeMaps(map1, map2);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 1);
        expected.put("B", 5);
        expected.put("C", 4);

        assertEquals(expected, mergedMap);
    }
}
