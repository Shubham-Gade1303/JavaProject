import java.util.*;
public class FindDuplicateCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();
        // HashSet<Character> abc = new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);

        //     if(abc.contains(ch)){
        //         System.out.print(ch + " ");
        //     }else{
        //         abc.add(ch);
        //     }
        // }

        int[] count = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            count[ch]++;
        }
        System.out.println("Duplicayye character: ");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (count[ch]>1) {
                count[ch]=0;
                System.out.print(ch+" " );
            }
        }
    }
}
