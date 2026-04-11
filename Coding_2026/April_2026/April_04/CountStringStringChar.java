package Coding_2026.April_2026.April_04;
import java.util.*;
public class CountStringStringChar {
    public static void main(String[] args) {
    List<String> list = Arrays.asList("Apple","Banan","Avocado","Mango","aim  ");

 list.stream().filter(x ->x.startsWith("A")|| x.startsWith("a")).forEach(System.out::println);
   
   
    }
}
