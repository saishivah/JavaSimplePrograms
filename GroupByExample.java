import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;
    
    // constructor and getters
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    // getters...

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", salary=" + salary +
               '}';
    }
}

public class GroupByExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", "IT", 50000),
            new Employee("Jane", "HR", 45000),
            new Employee("Bob", "IT", 55000),
            new Employee("Alice", "HR", 47000)
        );
        
        Map<String, List<Employee>> byDepartment = employees.stream()
            .collect(Collectors.groupingBy(emp -> emp.department));
            
        System.out.println(byDepartment);
        // Output: {IT=[John, Bob], HR=[Jane, Alice]}
    }
}