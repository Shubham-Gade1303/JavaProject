package HackerRank;
import java.util.*;


class UserName{
    public static final String regular = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}
public class ValidUserNameExpression {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String []args)throws Exception{


        int n = Integer.parseInt(scan.nextLine());

        while (n-- != 0) {
            String userName = scan.nextLine();

            if(userName.matches(UserName.regular)){
                System.out.println("Valid");
            } else{
                System.out.println("Invalid");
            }
        }
    }
}
