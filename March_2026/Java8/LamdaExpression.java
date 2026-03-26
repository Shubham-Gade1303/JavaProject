package March_2026.Java8;
import java.util.function.*;
public class LamdaExpression{
    public static void main(String[] args) {
        Predicate<String> isLongerThan5 = s -> s.length() >5;
        System.out.println(isLongerThan5.test("java"));
        System.out.println(isLongerThan5.test("shubham"));  
    }
}