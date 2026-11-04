package Nov2026.StreamAPI;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5);

        HashSet<Integer> set = new HashSet<>();

        list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
    }
}
