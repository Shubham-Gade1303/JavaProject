package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 45, 23, 89, 12, 67, 34);
      int max = list.stream().max(Integer::compareTo).get();
      System.out.println(max);
    }
}
