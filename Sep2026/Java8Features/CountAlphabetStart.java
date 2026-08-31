package Sep2026.Java8Features;

import java.util.Arrays;
import java.util.List;

public class CountAlphabetStart {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Amit", "Rahul", "Ankit", "Priya",
                  "Akash", "Rohit");


                  long coutn = list.stream().filter(n -> n.startsWith("A")).count();
                    System.out.println(coutn);
    }
}
