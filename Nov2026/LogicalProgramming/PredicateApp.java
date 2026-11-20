package Nov2026.LogicalProgramming;
import java.util.function.Predicate;;
public class PredicateApp {

    public static void main(String[] args) {
        Predicate<Integer> p = num -> num % 2 ==0;

        System.out.println(p.test(10));
        System.out.print(p.test(13));
    }
    
}
