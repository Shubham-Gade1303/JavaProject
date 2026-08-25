package August2026.MAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FailFast {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for(Integer n : list){
            if( n % 2 ==0){
                list.remove(n);
            }
        }
    }
}
