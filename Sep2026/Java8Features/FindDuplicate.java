package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);

        Set<Integer> set = new HashSet<>();
    
        list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet()).forEach(System.out::println);
        
    }
}
