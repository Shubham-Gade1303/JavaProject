package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class AddMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        list.stream().map(n -> n + 10).forEach(System.out::println);
    }    
}
