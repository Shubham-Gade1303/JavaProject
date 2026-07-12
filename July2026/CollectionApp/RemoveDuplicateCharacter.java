package July2026.CollectionApp;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter String: ");
       String s = sc.next();

       LinkedHashSet<Character> set = new LinkedHashSet<>();
       for(char ch : s.toCharArray()){
        set.add(ch);
       }

       StringBuilder sb = new StringBuilder();
       for(char ch : set){
        sb.append(ch);
       }
       System.out.println(sb);
    }
}
