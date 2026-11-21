package Nov2026.LogicalProgramming;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> s = name -> System.out.println("Hello  "+ name);

        s.accept("Shubham");
    }
}
