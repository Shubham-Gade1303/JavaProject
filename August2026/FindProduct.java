package August2026;

import java.util.Scanner;

public class FindProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: " );
        int num = sc.nextInt();

        int product =1;

        while(num != 0){
            int digit = num % 10;
            product = product * digit;
            num = num /10; 
        }
        System.out.print("Product of digit: "+ product);
    }
}