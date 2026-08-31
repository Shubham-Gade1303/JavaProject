package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);
        list.stream().map(n -> n * n ).forEach(System.out::println);
    }
}
