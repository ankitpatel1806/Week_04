package listinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        List<Integer> intList = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> listWithoutDuplicates = RemoveDuplicates.remove(intList);
        assertEquals(Arrays.asList(3, 1, 2, 4), listWithoutDuplicates);
    }
}