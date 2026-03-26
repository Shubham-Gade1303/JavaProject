package CollectionFramework;

import java.util.Stack;
public class StackApp {
    public static void main(String args[])throws Exception{
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);
    }

    
}
