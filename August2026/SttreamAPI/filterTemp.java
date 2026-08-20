package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class filterTemp {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(0.0, 10.0, 20.0, 30.0);
        
        list.stream().map(n -> (n * 9/5)+ 32).forEach(System.out::println);
    }
}
