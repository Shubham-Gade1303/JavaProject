package Coding_2026.April_2026.April_04;
import java.util.Arrays;
import java.util.*;
public class Greatger {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,20,30,50,60,40);
        list.stream().map(x -> x * x).forEach(System.out::println);
    }
}
