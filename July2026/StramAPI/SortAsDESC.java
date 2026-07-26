package July2026.StramAPI;

import java.util.Arrays;
import java.util.List;

public class SortAsDESC {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,12,20,11,20,22, 11,11, 5000);

        list.stream().sorted((a,b)-> b-a).forEach(System.out::println);
    }
}
