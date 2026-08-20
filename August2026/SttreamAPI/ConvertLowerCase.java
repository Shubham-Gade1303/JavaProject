package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class ConvertLowerCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("SHUBHAM","SWAPNIL", "SQL","PYTHON");

        list.stream().map(n -> n.toLowerCase()).forEach(System.out::println);
    }
}
