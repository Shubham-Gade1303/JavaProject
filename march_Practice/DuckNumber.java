package march_Practice;
import java.util.*;
public class DuckNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();

        for(int i=0;i<=num;i++){
            int a = i;
            boolean isDuck = false;

            while(a>0){
                int digit = a%10;
                if(digit==0){
                    isDuck=true;
                    break;
                }
                a = a/10;
            }
            if(isDuck){
                System.out.print(i+" ");
            }
        }
    }
}
