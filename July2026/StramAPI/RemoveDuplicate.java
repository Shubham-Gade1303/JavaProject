package July2026.StramAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7);
        list.stream().distinct().forEach(System.out::println);

    }
}
