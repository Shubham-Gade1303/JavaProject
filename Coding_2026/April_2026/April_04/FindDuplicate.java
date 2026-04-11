package Coding_2026.April_2026.April_04;
import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,1,4);
        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicate = list.stream().filter(x -> !seen.add(x)).toList();
        System.out.println(duplicate);
        
    }
}
