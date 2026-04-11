package March_2026.Java8;
import java.util.*;
public class MaximumNum {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(100,200,220,3000,100000);

        int max  =list.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
