package Nov2026.LogicalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StaticmethodDemo {
    static boolean isEven(int n){ return n % 2==0;   }
    static int square(int n){     return n *n;  }
    static void print(Object o){    System.out.print(o);   }
    public static void main(String[] args) {
        List<Integer>  nums = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> even = StaticmethodDemo::isEven;
        Function<Integer ,Integer> sq = StaticmethodDemo::square;
        Function<String, Integer> parse = Integer::parseInt;
        BinaryOperator<Integer> max = Math::max;

        nums.stream()
        .filter(StaticmethodDemo::isEven)
        .map(StaticmethodDemo::square)
        .forEach(StaticmethodDemo::print);

        System.out.print(parse.apply("123"));
        System.out.print(max.apply(10, 12));

    }
}
