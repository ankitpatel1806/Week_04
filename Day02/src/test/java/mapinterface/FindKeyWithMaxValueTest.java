package mapinterface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class FindKeyWithMaxValueTest {

    @Test
    public void testFindKeyWithMaxValue() {
        FindKeyWithMaxValue finder = new FindKeyWithMaxValue();


        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);


        String keyWithMaxValue = finder.findKeyWithMaxValue(inputMap);


        assertEquals("B", keyWithMaxValue);
    }
}
