package Nov2026.StreamAPI.EmpApp;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(

            new Employee(1, "Shuabhm", 450000),
            new Employee(2, "app", 500000),
            new Employee(3, "sap", 440000),
            new Employee(4, "java", 420000),
            new Employee(5, "python", 400000), 
            new Employee(6, "kalla", 30000)

        );

        employee.stream().filter(e -> e.getSalary() > 40000).forEach(e -> System.out.println(e.getSalary()));

        List<String> names = employee.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);
    }
}
