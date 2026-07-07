package July2026;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1 : " );
        String s = sc.nextLine();
        System.out.print("String 2 : " );
        String s2 =sc.next();

        if(s.length() != s2.length()){
            System.out.print("NOt Anagram..");
        }

        char[] a = s.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }




    }
}
