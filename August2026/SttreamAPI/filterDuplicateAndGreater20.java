package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class filterDuplicateAndGreater20 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 30, 50, 10, 60);
        
        list.stream().distinct().filter(n -> n > 20).forEach(n -> System.out.print(n +" "));
    }
}
