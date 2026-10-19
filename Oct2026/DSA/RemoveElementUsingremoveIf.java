package Oct2026.DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementUsingremoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> llist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int target=6;
        llist.removeIf(x ->x == target);

        System.out.print(llist);
    }
}
