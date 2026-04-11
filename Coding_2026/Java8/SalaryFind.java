package March_2026.Java8;
import java.util.*;
class Employee{
int id;
String name;
double salary;

public Employee(int id, String name, double salary){
    this.id=id;
    this.name=name;
    this.salary=salary;

}
public double getSalary(){
    return salary;
}
}
public class SalaryFind {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee(1, "A", 100000),
            new Employee(2, "B", 110000),
            new Employee(3, "C", 300000),
            new Employee(4, "D", 250000)
        );
        Optional<Double> secondHigh = list.stream().
        map(Employee::getSalary).
        distinct().
        sorted(Comparator.reverseOrder()).
        skip(1).findFirst();
        System.out.println(secondHigh);
    }
}
