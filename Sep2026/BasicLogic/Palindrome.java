package Sep2026.BasicLogic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        int org = num;
        int rev =0;

        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num /10;
        }
        if(rev == org){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("number is not palindrome.");
        }


    }
}
