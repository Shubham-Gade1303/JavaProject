package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class UD {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 15, 12, 18, 20, 15, 21, 18, 25);



        list.stream().filter(n -> n % 3 ==0).distinct().sorted().forEach(System.out::println);
    }
}
