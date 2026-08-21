package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class FilterMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30,35,40,45,50);

        list.stream().filter(n -> n >20).map(n -> n * n).forEach(System.out::println);
    }
}
