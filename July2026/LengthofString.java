package July2026;

import java.util.Scanner;

public class LengthofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count =0;

        for(char ch : s.toCharArray()){
            count++;
        }
        System.out.println(count);


    }
}
