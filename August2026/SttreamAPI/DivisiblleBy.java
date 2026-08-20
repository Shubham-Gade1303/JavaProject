package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class DivisiblleBy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,21,551,500);

        list.stream().filter(n -> n % 5 == 0).forEach(System.out::println);
    }
}
