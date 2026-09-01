package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;

class Employee{
    int id;
    String name;
    String department;
    double salary;


    public Employee(int id, String name, String department, double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
}
public class Main {
    public static void main(String[] args){

        List<Employee> list = Arrays.asList(
            new Employee(101, "Rahul", "IT", 60000),
            new Employee(102, "Amit", "HR", 45000),
            new Employee(103, "priya", "IT", 75000),
            new Employee(104, "Neha", "Finance", 50000),
            new Employee(105, "Rohan", "HR", 40000),
            new Employee(106, "sneha", "IT", 25000),
            new Employee(107, "Rahul", "Finance",  55000),
            new Employee(108, "Rahul", "IT", 50010)

        );


        list.stream().sorted().findFirst().get();


    }
}
