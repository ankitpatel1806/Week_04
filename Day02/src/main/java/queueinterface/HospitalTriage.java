package queueinterface;
import java.util.*;

public class HospitalTriage {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    public static void processTriage(List<Patient> patients) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);
        pq.addAll(patients);

        while (!pq.isEmpty()) {
            Patient patient = pq.remove();
            System.out.println(patient.name + " with severity " + patient.severity);
        }
    }

    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("John", 3),
                new Patient("Alice", 5),
                new Patient("Bob", 2)
        );

        processTriage(patients);
    }
}
