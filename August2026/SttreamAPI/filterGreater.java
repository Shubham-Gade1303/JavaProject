package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class filterGreater {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,51);

        list.stream().filter(n -> n >50).forEach(System.out::println);
    }
}
