package march_Practice;

import java.util.Scanner;

public class RemoveSpaceString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        String rev = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
            rev= rev + s.charAt(i);
            }
        }
        System.out.println(rev);
    }
}
