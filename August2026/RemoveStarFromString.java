package August2026;
import java.util.*;
import java.util.Scanner;

public class RemoveStarFromString{
    public String RemoveStar(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        } 
            return ans.reverse().toString();
       
    }
    


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        RemoveStarFromString obj = new RemoveStarFromString();
        System.out.print(obj.RemoveStar(s));
    }
}