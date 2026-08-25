package August2026.MAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastUsingItertator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> it = list.iterator();
        
            
        while(it.hasNext()){
            Integer num = it.next();
            if(num % 2 ==0){
                it.remove();
            }
        }
        System.out.print(list);
    }
}
