package July2026.StramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("SQL","CSS","JAVA","HTML", "SPRING");

        Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }
}
