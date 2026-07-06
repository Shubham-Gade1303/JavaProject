package July2026;

import java.util.Scanner;

public class LeetcodePalindrome {
    public boolean isPlindrome(String s){
        s = s.toLowerCase();
        String clean = "";

        for(int i =s.length()-1;i>=0;i--){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                clean +=ch;
            }
        }    

            String rev ="";
            for(int i=clean.length()-1;i>=0;i--){
                rev +=clean.charAt(i);

            }
            return clean.equals(rev);
        


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LeetcodePalindrome obj = new LeetcodePalindrome();

       boolean ans= obj.isPlindrome(s);

        System.out.println(ans);
    }
}
