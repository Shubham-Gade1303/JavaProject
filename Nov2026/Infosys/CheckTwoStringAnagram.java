package Nov2026.Infosys;

import java.util.Scanner;

public class CheckTwoStringAnagram {


    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;

        }
         
        for(int i=0;i<26;i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 String: ");
        String s1 = sc.next();
        System.out.print("Enter 2 String: ");
        String s2 = sc.next();


        CheckTwoStringAnagram obj = new CheckTwoStringAnagram();
        boolean result = obj.isAnagram(s1,s2);

        System.out.print("result : "+result);




    }
}
