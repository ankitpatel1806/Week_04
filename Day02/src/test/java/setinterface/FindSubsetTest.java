package setinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class FindSubsetTest {
    @Test
    public void testFindSubsets() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Set<Integer>> expectedSubsets = new HashSet<>();
        expectedSubsets.add(new HashSet<>());
        expectedSubsets.add(new HashSet<>(Arrays.asList(1)));
        expectedSubsets.add(new HashSet<>(Arrays.asList(2)));
        expectedSubsets.add(new HashSet<>(Arrays.asList(3)));
        expectedSubsets.add(new HashSet<>(Arrays.asList(1, 2)));
        expectedSubsets.add(new HashSet<>(Arrays.asList(1, 3)));
        expectedSubsets.add(new HashSet<>(Arrays.asList(2, 3)));
        expectedSubsets.add(new HashSet<>(Arrays.asList(1, 2, 3)));
        assertEquals(expectedSubsets, FindSubsets.findSubsets(set));
    }
}
