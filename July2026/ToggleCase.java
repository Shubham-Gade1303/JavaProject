package July2026;
import java.util.Scanner;

public class ToggleCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                    ans.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch))
                {
                    ans.append(Character.toUpperCase(ch));
            }
        }
        System.out.println("REsult:  "+ans.toString());
    }
}