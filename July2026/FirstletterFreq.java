package July2026;

import java.util.Scanner;

public class FirstletterFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String s = sc.next();


        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
        
        if(s.indexOf(ch) == s.lastIndexOf(ch)){
            System.out.print(i +"\n");
            return;
            
           }   
            
        }

        System.out.println(-1);
    }
}
