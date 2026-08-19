package August2026.SttreamAPI;

import java.util.Arrays;
import java.util.List;

public class findOddNum {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20);

        list.stream().filter(n -> n % 2 !=0).forEach(System.out::println);
    }
}
