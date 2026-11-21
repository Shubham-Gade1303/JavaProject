package Nov2026.LogicalProgramming;

import java.util.function.Predicate;

public class PrediacteDemo {
    public static void main(String[] args) {
        
        Predicate<Integer> p = n -> n %2 ==0;
        System.out.println(p.test(22));
        System.out.println(p.test(21));


        Predicate<Integer> s = n -> n >5;
        System.out.println(p.and(s).test(10));
        System.out.println(p.and(s).test(4));


        //or
        System.out.println(p.or(s).test(7));
        System.out.println( );

    }
}
