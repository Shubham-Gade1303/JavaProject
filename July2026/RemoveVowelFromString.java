package July2026;

import java.util.Scanner;

public class RemoveVowelFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String result = s.replaceAll("[aeiou]", "");

        System.out.print("Result after remove vowel: "+result);
    }
}
