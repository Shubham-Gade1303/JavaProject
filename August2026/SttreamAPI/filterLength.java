package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class filterLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "SQL", "Developer");
        names.stream().filter(n -> n.length() > 5).forEach(System.out::println);
    }
}
