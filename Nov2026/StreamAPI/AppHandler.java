package Nov2026.StreamAPI;

import java.util.Optional;

public class AppHandler {
    public static void main(String[] args)
{
    Optional<String> name = Optional.ofNullable(null);
    System.out.println(name.empty());

}
}
