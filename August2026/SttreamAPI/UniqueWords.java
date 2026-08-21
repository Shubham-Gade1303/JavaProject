package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class UniqueWords {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "java",
        "hibernate", "spring", "sql");


        list.stream().distinct().forEach(System.out::println);
    }
}
