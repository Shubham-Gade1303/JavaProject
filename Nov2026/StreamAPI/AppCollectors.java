package Nov2026.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppCollectors {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("java", "Shubham", "Swapnil","Avinash");

        List<String> result = name.stream().filter(n -> n.length()==7).collect(Collectors.toList());
        System.out.println(result);
        
    }
}
