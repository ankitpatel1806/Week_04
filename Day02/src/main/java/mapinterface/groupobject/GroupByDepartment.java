package mapinterface.groupobject;
import java.util.*;

public class GroupByDepartment {

    public Map<Department, List<Employee>> groupEmployeesByDepartment(List<Employee> employees) {
        Map<Department, List<Employee>> groupedByDepartment = new HashMap<>();

        for (Employee employee : employees) {
            groupedByDepartment
                    .computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>())
                    .add(employee);
        }

        return groupedByDepartment;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Department.HR),
                new Employee("Bob", Department.IT),
                new Employee("Carol", Department.HR)
        );

        GroupByDepartment groupByDepartment = new GroupByDepartment();
        Map<Department, List<Employee>> result = groupByDepartment.groupEmployeesByDepartment(employees);

        result.forEach((department, employeeList) ->
                System.out.println(department + ": " + employeeList));
    }
}

