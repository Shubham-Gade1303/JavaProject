package Oct2026.DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementUsingRemove {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); 

        list.remove(Integer.valueOf(6));

        for(int num : list){
            System.out.print(num + " ");
        }

    }
}
