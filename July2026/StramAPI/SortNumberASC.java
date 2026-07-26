package July2026.StramAPI;

import java.util.Arrays;
import java.util.List;

public class SortNumberASC {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,3,1,4,6,8,7,9,11);

        list.stream().sorted().forEach(System.out::println);
    }
}
