package Nov2026.Infosys;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s){
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        return  rev;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String s = sc.next();

        String result = reverseString(s);
        System.out.print("Result: "+result);
    }
}
