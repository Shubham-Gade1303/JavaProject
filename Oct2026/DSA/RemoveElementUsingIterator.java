package Oct2026.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveElementUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int target =6;
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next()==target){
                iterator.remove();
            }
        }
        System.out.print(list+ " ");
    }
}
