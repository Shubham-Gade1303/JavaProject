package Nov2026.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class mapAPP {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

      List<Integer> result =  list.stream().map(n -> n *n ).collect(Collectors.toList());
      System.out.print(result);

    }
}
