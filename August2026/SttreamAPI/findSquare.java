package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class findSquare {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8);
        list.stream().map(n -> n * n).forEach(System.out::println);
    }
}
