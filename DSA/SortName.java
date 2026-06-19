import java.util.ArrayList;
import java.util.Collections;

public class SortName {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("baba");
         list.add("abahay");
          list.add("java");
        list.add("C");

        Collections.sort(list);
        System.out.print(list);
    }
}
