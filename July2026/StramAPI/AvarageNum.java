package July2026.StramAPI;

import java.util.*;

public class AvarageNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble(); 

    }
}
