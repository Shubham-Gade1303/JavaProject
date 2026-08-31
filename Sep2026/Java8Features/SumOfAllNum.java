
package Sep2026.Java8Features;
import java.util.*;

public class SumOfAllNum{
    public static void main(String[] args){
        List<Integer> list =  Arrays.asList(10, 20, 30, 40, 50);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

    }    
}