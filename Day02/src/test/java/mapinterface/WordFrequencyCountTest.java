package mapinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class WordFrequencyCountTest {

    @Test
    public void testCountWordFrequency() {
        WordFrequencyCount counter = new WordFrequencyCount();

        // Test input
        String inputText = "Hello world, hello Java!";

        // Get word frequencies from the input text
        Map<String, Integer> frequencies = counter.countWordFrequency(inputText);

        // Expected word frequencies
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        expected.put("java", 1);

        // Assert that the frequencies match
        assertEquals(expected, frequencies);
    }
}

