package July2026.StramAPI;

import java.util.Arrays;
import java.util.List;

public class CountElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","python","C++","C");

        long name = list.stream().count();
        System.out.println(name);
    }
}
