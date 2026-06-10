package June_2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameConversion {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("shubham", "pandurang", "gade");

        list.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
    }
}
