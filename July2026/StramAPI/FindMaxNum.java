package July2026.StramAPI;

import java.util.Arrays;
import java.util.List;

public class FindMaxNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,100);
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
