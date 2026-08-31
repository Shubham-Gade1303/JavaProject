package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;

public class GreaterThan {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 55, 23, 78, 90, 45, 67);
        
        list.stream().filter(n -> n > 50).forEach(System.out::println);
    
    }
}
