package listinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

public class FrequencyCounterTest {

    @Test
    public void testCountFrequency() {
        List<String> strList = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = FrequencyCounter.countFrequency(strList);
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("apple", 2);
        expectedMap.put("banana", 1);
        expectedMap.put("orange", 1);
        assertEquals(expectedMap, frequencyMap);
    }
}
