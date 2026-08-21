package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class RemoveDName {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SQL", "Java", "Spring", "SQL");

        list.stream().distinct().forEach(System.out::println);
        
    }
}
