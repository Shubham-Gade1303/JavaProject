package Sep2026.DSA;

import java.util.Scanner;

public class ReverseDegreeOfString {
    public int revdegree(String s){
        int sum =0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            int revV = 'z' - ch+1;

            sum = sum + revV * (i+1);
        }
        return sum;
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        ReverseDegreeOfString obj = new ReverseDegreeOfString();

     int result =   obj.revdegree(s);
     System.out.println(result);

    }
}
