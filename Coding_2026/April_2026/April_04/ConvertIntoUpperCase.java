package Coding_2026.April_2026.April_04;
import java.util.*;
public class ConvertIntoUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","pyton","c++");

        list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
    }
    
}
