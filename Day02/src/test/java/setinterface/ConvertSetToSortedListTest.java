package setinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

public class ConvertSetToSortedListTest {

    @Test
    public void testConvertToSortedList() {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> expectedSortedList = Arrays.asList(1, 3, 5, 9);
        assertEquals(expectedSortedList, ConvertSetToSortedList.convertToSortedList(set));
    }
}