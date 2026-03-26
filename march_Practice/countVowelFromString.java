package march_Practice;

public class countVowelFromString {
    public static void main(String[] args){
        String s = "shubham";
        String s1 = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s1);
    }
}
