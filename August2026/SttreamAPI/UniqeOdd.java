package August2026.SttreamAPI;

import java.util.*;

public class UniqeOdd {
    public static void main(String[] args) {
     List<Integer> numbers =
    Arrays.asList(11, 15, 11, 20, 25, 15, 30, 35);

    numbers.stream().filter(n -> n %2 !=0).distinct().forEach(System.out::println);
    }
}
