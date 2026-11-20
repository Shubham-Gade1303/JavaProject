package Nov2026.LogicalProgramming;
import java.util.function.Predicate;;
public class PredicateApp {

    public static void main(String[] args) {
        Predicate<Integer> p = n -> n >10;
        Predicate<Integer>p2 = n -> n <50;



        System.out.println(p.and(p2).test(20));
        System.out.println(p.or(p2).test(5));
        System.out.println(p.negate().test(20));
    }
    
}
