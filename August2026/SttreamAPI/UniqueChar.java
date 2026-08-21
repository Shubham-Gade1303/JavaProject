package August2026.SttreamAPI;



public class UniqueChar {
    public static void main(String[] args) {
     String s = "programming";

     s.chars().mapToObj( n -> (char) n).distinct().forEach(n -> System.out.print(n + " "));
    }
}
