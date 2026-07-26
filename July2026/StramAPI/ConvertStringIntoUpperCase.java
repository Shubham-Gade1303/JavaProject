package July2026.StramAPI;
import java.util.*;

public class ConvertStringIntoUpperCase{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "is", "good ", "language");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}