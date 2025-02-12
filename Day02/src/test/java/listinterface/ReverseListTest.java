package listinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

public class ReverseListTest {

    @Test
    public void testReverse() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversedList = ReverseList.reverse(intList);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), reversedList);
    }
}
