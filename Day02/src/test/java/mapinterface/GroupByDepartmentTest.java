package mapinterface;

import mapinterface.groupobject.Department;
import mapinterface.groupobject.Employee;
import mapinterface.groupobject.GroupByDepartment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class GroupByDepartmentTest {

    @Test
    public void testGroupEmployeesByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Department.HR),
                new Employee("Bob", Department.IT),
                new Employee("Carol", Department.HR)
        );

        GroupByDepartment groupByDepartment = new GroupByDepartment();
        Map<Department, List<Employee>> result = groupByDepartment.groupEmployeesByDepartment(employees);

        Map<Department, List<Employee>> expected = new HashMap<>();
        expected.put(Department.HR, Arrays.asList(new Employee("Alice", Department.HR), new Employee("Carol", Department.HR)));
        expected.put(Department.IT, Arrays.asList(new Employee("Bob", Department.IT)));

        assertEquals(expected, result);
    }
}
