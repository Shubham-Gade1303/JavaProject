package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class filterPositive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,-1,-200,-2121,011);

        list.stream().filter(n -> n > 0).forEach(System.out::println);
    }
}
