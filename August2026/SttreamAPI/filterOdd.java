package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class filterOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);

        list.stream().filter(n -> n %2 != 0).forEach(System.out::println);
    }
}
