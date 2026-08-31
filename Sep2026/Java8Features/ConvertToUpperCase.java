package Sep2026.Java8Features;

import java.util.Arrays;

import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> list =  Arrays.asList("rahul", "amit", "priya", "rohit");
        list.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

    }
}
