package July2026.CollectionApp;

import java.util.*;

public class DuplicateRemove {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);


        Set<Integer> set = new LinkedHashSet <>(list);

          System.out.println("Before remove: " + list);
          System.out.println("After Remove Duplicate: "+ set);
    }
}
