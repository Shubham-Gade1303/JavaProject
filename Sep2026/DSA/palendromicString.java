package Sep2026.DSA;

import java.util.*;
public class palendromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String org =s;
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if( org.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
