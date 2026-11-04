package Nov2026.StreamAPI;

import java.util.*;

public class CountElement {
    public static void main(String[] args){
      List<String> list = Arrays.asList("Java");

      long count = list.stream().count();
        System.out.print(count);

    }
}
