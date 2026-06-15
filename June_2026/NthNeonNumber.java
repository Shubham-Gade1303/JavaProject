package June_2026;
import java.util.Scanner;
public class NthNeonNumber {
    public static boolean isNeoan(int n){
            int square = n*n;
            int sum =0;
            while(square>=0){
                sum = sum + square %10;
                square = square /10;
        }return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n =sc.nextInt();
        for(int i =1;i<=n;i++){
            if(isNeoan(i)){
                 System.out.println(i);
            }
        }
    }
}
