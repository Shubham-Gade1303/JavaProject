package July2026.StramAPI;

import java.util.Arrays;
import java.util.List;

public class secondLowNum {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,40,50,50,45);
        int secondMax  = list.stream().distinct().sorted().skip(1).findFirst().get();
        System.out.println(secondMax);
    }
}