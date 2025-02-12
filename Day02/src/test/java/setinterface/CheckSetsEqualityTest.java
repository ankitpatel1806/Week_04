package setinterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;
public class CheckSetsEqualityTest {

    @Test
    public void testAreSetsEqual() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        assertTrue(CheckSetsEquality.areSetsEqual(set1, set2));
    }
}
