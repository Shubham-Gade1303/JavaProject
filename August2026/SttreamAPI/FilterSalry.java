package August2026.SttreamAPI;

import java.util.*;

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
}
public class FilterSalry {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
            new Employee("shubham", 500000),
            new Employee("sham", 450000),
            new Employee("evofox", 250000),
            new Employee("amit", 3400)
        );


        emp.stream().filter(n -> n.salary > 350000).forEach(n -> System.out.println(n.name));
    }
}
