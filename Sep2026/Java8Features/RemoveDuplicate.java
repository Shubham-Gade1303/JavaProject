package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40, 30, 50);

        list.stream().distinct().forEach(System.out::println);
    }
}
