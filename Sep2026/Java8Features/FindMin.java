package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;

public class FindMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 45, 23, 89, 12, 67, 34);
        int min = list.stream().min(Integer::compareTo).get();
        System.out.println(min);
        
    }
}
