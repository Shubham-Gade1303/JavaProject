package Sep2026.DSA;

import java.util.Scanner;

public class PalindromeString {
    public static boolean palindromeString(String s){

        s = s.toLowerCase();
        int left =0;
        int right= s.length()-1;

        while(left < right ){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter String : " );
        String s = sc.next();

        System.out.println(palindromeString(s));


    }
}
