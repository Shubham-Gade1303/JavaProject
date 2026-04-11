package March_2026.march31;
import java.util.*;
public class AnagramCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings: ");
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Anagarm");

        }else{
            System.out.println("Not a Anagram");
        }

    }
}
