package Sep2026.DSA;
import java.util.*;

public class ValidParenthesisString{
    public boolean checkValidString(String s){
        int minOp=0;
        int maxOp=0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                minOp++;
                maxOp++;
            }
            else if( ch == ')'){
                minOp--;
                maxOp--;

            }
            else {
                minOp--;
                maxOp++;
            }
            if( maxOp < 0){
                return  false;
            }
            minOp = Math.max(minOp, 0);
        }
        return  minOp==0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");

        String s = sc.next();


        ValidParenthesisString obj = new ValidParenthesisString();
        boolean  result = obj.checkValidString(s);

        System.out.println(result);


    }
}