package Nov2026.StreamAPI;

import java.util.List;
import java.util.Arrays;

public class filterApp{
    public static void main(String[] args) {
        List<Integer> list =  Arrays.asList(1,2,3,4,5);
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        
    }
}
