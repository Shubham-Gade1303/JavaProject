package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40, 30);

        long c = list.stream().distinct().count();
        System.out.println(c);
    }
}
