package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class findUniqe {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 25, 30, 20, 35, 40);

        list.stream().filter(n -> n %2 ==0).distinct().forEach(System.out::println);
    }
}
