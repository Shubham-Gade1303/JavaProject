package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class filterName {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("shubham", "shiva", "amit", "swapnil","pawan");

        list.stream().filter(n -> n.startsWith("s")).forEach(System.out::println);
    }
}
