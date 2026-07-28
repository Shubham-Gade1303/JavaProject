package July2026.StramAPI;

import java.util.Arrays;
import java.util.List;

public class FindMinNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,1,100);

        int min = list.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}
