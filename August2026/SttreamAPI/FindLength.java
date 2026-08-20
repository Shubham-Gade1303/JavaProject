package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("shubham", "rahul", "amit", "priya");
        list.stream().map(n -> n.length()).forEach(System.out::println);
    }
} 
