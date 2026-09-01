package Sep2026.Java8Features;

import java.lang.StackWalker.Option;
import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }

}

public class Main {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(101, "Rahul", "IT", 60000),
                new Employee(102, "Amit", "HR", 45000),
                new Employee(103, "priya", "IT", 75000),
                new Employee(104, "Neha", "Finance", 50000),
                new Employee(105, "Rohan", "HR", 40000),
                new Employee(106, "sneha", "IT", 25000),
                new Employee(107, "Rahul", "Finance", 55000),
                new Employee(108, "Rahul", "IT", 50010)

        );

        Employee HighSalary = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println("Highest Salary: ");
        System.out.print(HighSalary);

        double avgSalary = list.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println("\n Avrage Salary : ");
        System.out.print(avgSalary);

        Map<String, Employee> highestByDepartment = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                        Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get)));

        System.out.println("\nHighest Paid Employee By Department:");

        highestByDepartment.forEach((department, employee) -> System.out.println(
                department + " -> " + employee));

        // salary > 60000

        List<Employee> salaryMore60000 = list.stream().filter(e -> e.getSalary() > 60000).collect(Collectors.toList());

        System.out.println("\nsalary moew than 600000");
        salaryMore60000.forEach(e -> System.out.println(e.getName()));

        // sort employee by salary descending

        List<Employee> sortedEmp = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("\nSorted Employee By salary ");

        sortedEmp.forEach(System.out::println);

        // Second highest salary

        Optional<Double> secondHight = list.stream().map(Employee::getSalary).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("\nSecond highest salary: ");
        System.out.println(secondHight.orElse(0.0));

    }
}
