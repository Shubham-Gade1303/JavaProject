package march_Practice;

import java.util.Scanner;

public class CountSpaceFromString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s  = sc.nextLine();
        int count =0;
    
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ')
                count++;
        }
        System.out.println("Total Spaces in the String: "+ count);


    }
}
