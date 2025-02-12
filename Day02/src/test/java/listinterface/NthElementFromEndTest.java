package listinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
public class NthElementFromEndTest {

    @Test
    public void testFindNthFromEnd() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        String nthElement = NthElementFromEnd.find(linkedList, 2);
        assertEquals("D", nthElement);
    }
}
