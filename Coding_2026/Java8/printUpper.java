package March_2026.Java8;
import java.util.*;
import java.util.function.Consumer;
public class printUpper {
    public static void main(String[] args){
        Consumer<String> printUpperLetter = s -> System.out.println(s.toUpperCase());
        printUpperLetter.accept("java is powerful programming language ");
    }
}
