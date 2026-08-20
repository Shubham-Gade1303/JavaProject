package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
class emp{
    String name;
    double salary;

    emp(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
        
}
public class WxtractEMp {
    public static void main(String[] args) {
        List<emp> list = Arrays.asList(
            new emp("shubham", 25000),
            new emp("swapnil", 55000),
            new emp("ankita", 8000),
            new emp("sham", 22090)
        );

        list.stream().map(n -> n.name).forEach(System.out::println);
    }    
}
