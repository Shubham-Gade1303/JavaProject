package Nov2026.StreamAPI;

import java.util.*;

public class FindFirstElement {
    public static void main(String[] args){
        List<String> list = Arrays.asList("john", "mike", "david");
        String first = list.stream().findFirst().orElse(null);

        System.out.print(first);

    }
}
