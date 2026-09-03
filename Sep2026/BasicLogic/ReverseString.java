package Sep2026.BasicLogic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = "";
    for(int i = s.length()-1;i>=0;i--){
        char ch = s.charAt(i);
        rev = rev + ch;
    }
    System.out.print(rev);
    }
}
