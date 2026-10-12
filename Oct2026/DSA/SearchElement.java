package Oct2026.DSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchElement {

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int k = 15;

        System.out.println("Linear search: " + list.contains(k));

        int index = Collections.binarySearch(list, k);

        if (index >= 0) {
            System.out.println("Element is in list");
        } else {
            System.out.println("Element is not in list");
        }
    }
}