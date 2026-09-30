package Sep2026.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class MaximuNestingDepthofTwoValidParenthesesStrings {
    public int[] maxDept(String seq){

        int[] result = new int[seq.length()];

        int dep=0;

        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i) == '('){
                dep++;
                result[i] = dep%2;
            }
            else{
                result[i] = dep%2;
                dep--;
            }
        }
        return result;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String seq = sc.next();

        MaximuNestingDepthofTwoValidParenthesesStrings obj = new MaximuNestingDepthofTwoValidParenthesesStrings();
        int[] app = obj.maxDept(seq);
        System.out.println("Result: "+ Arrays.toString(app));
        
    }
}
