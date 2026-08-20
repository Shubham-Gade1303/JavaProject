package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindBetweenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(n ->   n >= 5 && n <= 10).forEach(System.out::println);;
    }
}
