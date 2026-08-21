package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindUandSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50, 20, 10, 30, 20, 50, 40, 10);

        list.stream().distinct().sorted().forEach(System.out::println);
    }
}
