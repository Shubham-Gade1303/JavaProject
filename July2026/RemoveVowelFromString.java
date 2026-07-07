package July2026;

import java.util.Scanner;

public class RemoveVowelFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // String result = s.replaceAll("[aeiou]", "");

        // System.out.print("Result after remove vowel: "+result);

       StringBuilder ans = new StringBuilder();

       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);

        if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
            ans.append(ch);
        }
       }
       System.out.println("after remove vowels:  "+ans.toString());
    }
}
