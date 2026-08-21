package August2026.SttreamAPI;

import java.util.*;

public class F1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 30, 25, 40, 30, 50, 10);
        
        list.stream().filter(n -> n >20).distinct().forEach(System.out::println);
    }
}
