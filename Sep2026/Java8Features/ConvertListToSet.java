package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,10);
        Set<Integer> set = list.stream().collect(Collectors.toSet());

        System.out.print(set);

    }
}
