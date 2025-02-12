package queueinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class HospitalTriageTest {

    @Test
    public void testProcessTriage() {
        List<HospitalTriage.Patient> patients = Arrays.asList(
                new HospitalTriage.Patient("John", 3),
                new HospitalTriage.Patient("Alice", 5),
                new HospitalTriage.Patient("Bob", 2)
        );

        List<String> expectedOrder = Arrays.asList("Alice", "John", "Bob");
        List<String> actualOrder = new ArrayList<>();

        HospitalTriage.processTriage(patients);
    }
}
