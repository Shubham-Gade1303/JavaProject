package Nov2026.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class App{
        public static void main(String[] args){
            List<Integer> list = Arrays.asList(1,2,3,4,5);

            List<Integer> app = list.stream().map(n -> n *2).collect(Collectors.toList());
            System.out.print(app);
        }
}