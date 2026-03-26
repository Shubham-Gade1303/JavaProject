package march_Practice;

import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter String ");
        String s =sc.nextLine();
        String rev ="";

        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.err.println("String is palindrome..");
        }else{
            System.out.println("String is not palindrome..");
        }

    }
}
