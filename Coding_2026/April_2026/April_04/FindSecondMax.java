package Coding_2026.April_2026.April_04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondMax {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(10,20,30,40,50);
        int secondMax = list.stream()
                        .sorted(Comparator
                        .reverseOrder())
                        .skip(1)
                        .findFirst()
                        .get();
                        System.out.println(secondMax);
    }
}
