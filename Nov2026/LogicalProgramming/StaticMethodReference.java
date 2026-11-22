package Nov2026.LogicalProgramming;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class StaticMethodReference{
    public static void print(String name){
        System.out.println(name);

    }

    public static void main(String[] args) {
        Consumer<String> p = StaticMethodReference::print;

        p.accept("java");
    }
}