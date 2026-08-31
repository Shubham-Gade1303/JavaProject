package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;

public class SortName {
    public static void main(String[] args) {
        List<String > list = Arrays.asList("Rahul", "Amit", "Sneha", "Karan", "Priya");

        list.stream().sorted().forEach(System.out::println);
    }
}
