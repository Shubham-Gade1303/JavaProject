package August2026;

import java.util.HashSet;
import java.util.Scanner;
public class SecondRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        // int count =0;

        // for(int i=0;i<s.length();i++){
        //     for(int j = i+1;j<s.length();j++){
        //         if(s.charAt(i) == s.charAt(j)){
        //             count++;

        //             if(count == 2){
        //                 System.out.print(s.charAt(i));
        //             }
        //         }
        //     }
        // }

        HashSet<Character> set = new HashSet<>();

        s.chars().mapToObj(c -> (char) c).filter(ch -> !set.add(ch)).findFirst()
        .ifPresentOrElse(ch -> System.out.println("second repeating character is : " + ch),() -> System.out.println("no repeating character found: ") );

    }
}
