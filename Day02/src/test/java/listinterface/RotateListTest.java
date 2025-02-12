package listinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

public class RotateListTest {
        @Test
        public void testRotate() {
            List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
            List<Integer> rotatedList = RotateList.rotate(intList, 2);
            assertEquals(Arrays.asList(30, 40, 50, 10, 20), rotatedList);
        }
    }

