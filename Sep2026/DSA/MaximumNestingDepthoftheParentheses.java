package Sep2026.DSA;

import java.util.Scanner;

public class MaximumNestingDepthoftheParentheses {
    
public int maxDepth(String str ){
    int depth =0;
    int maxD=0;

    for(char ch : str.toCharArray()){
        if(ch == '('){
            depth++;
            maxD = Math.max(maxD, depth);

        }
        else if(ch ==')'){
            depth--;
        }
    }
    return maxD;
}

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.next();

        MaximumNestingDepthoftheParentheses obj =new MaximumNestingDepthoftheParentheses();
        int result = obj.maxDepth(str);

        System.out.println(result);
    }
}
