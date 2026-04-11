package March_2026.Java8;
import java.util.*;
public class FindEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        list.stream()
            .filter(x -> x %2 ==0)
            .forEach(System.out::println);
    }
}
