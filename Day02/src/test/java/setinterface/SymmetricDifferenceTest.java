package setinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class SymmetricDifferenceTest {

    @Test
    public void testSymmetricDifference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expectedSymDiff = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expectedSymDiff, SymmetricDifference.symmetricDifference(set1, set2));
    }
}
