package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class ConvertNameToUppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("shubham", "rahul", "amit", "priya");

        list.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
    }
}
