package August2026.SttreamAPI;

import java.util.function.Predicate;

public class TrueFalse {
    public static void main(String[] args) {
        Predicate<Integer> p = n -> n > 10;
        System.out.println(p.test(11));
    }
}
