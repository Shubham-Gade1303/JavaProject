package Sep2026.DSA;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringFromValidParenthitis{
    public static  String rev(String str){
        Stack<StringBuilder > stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch == '('){
            stack.push(sb);

            sb = new StringBuilder();
            } else if(ch == ')'){
                sb.reverse();

             StringBuilder pre = stack.pop();

             pre.append(sb);

             sb = pre;
            }else{
                sb.append(ch);
            }

        }
        return  sb.toString();
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

            String result = rev(str);

            System.out.println(result);

    }
    
} 