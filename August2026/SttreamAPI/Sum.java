package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70);

        int sum = list.stream().reduce(0, (a,b) -> a+b);
        System.out.print(sum);
    }
}
