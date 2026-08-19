package August2026.SttreamAPI;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithStream{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("HTML");
        list.add("python");
        list.add("C++");

        list.forEach( i -> System.out.print(i+" "));

        System.out.println();

        List<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);


        System.out.print(num + " ");

        num.removeIf(n -> n % 2 != 0);
        System.out.print(num);
    }
}