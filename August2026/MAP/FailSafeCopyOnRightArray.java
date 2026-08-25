package August2026.MAP;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeCopyOnRightArray {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,910));

        for(Integer num : list){
            if(num % 2 == 0 ){
                list.remove(num);
            }
        }
        System.out.print(list);
    }
}
