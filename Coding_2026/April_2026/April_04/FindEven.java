package Coding_2026.April_2026.April_04;

import java.util.*;


public class FindEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30,35,40);
        list.stream().filter(x -> x%2==0).forEach(System.out::println);
    }
}
