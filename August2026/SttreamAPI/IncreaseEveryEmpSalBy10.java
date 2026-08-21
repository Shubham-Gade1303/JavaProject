package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;
class Emp{
        String name;
        double salary;

        public Emp(String name, double salary){
            this.name=name;
            this.salary=salary;
        }
}
public class IncreaseEveryEmpSalBy10 {
    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(

        new Emp("Rahul", 25000),
        new Emp("Amit", 4500),
        new Emp("Shubham", 50000),
        new Emp("Priya", 30000)
        );

        list.stream().map(n -> n.salary * 1.10).forEach(System.out::println);
    }
}
