package Oct2026.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveElementUsingStram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int target = 6;

        list = list.stream().filter(x -> x != target).collect(Collectors.toCollection(ArrayList::new));
        System.out.print(list);

    }
}
