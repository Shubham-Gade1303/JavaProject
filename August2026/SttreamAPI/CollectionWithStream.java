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
    }
}