package August2026;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

            int reverse =0;

            while(num != 0){
                int digit = num % 10;

                reverse = reverse * 10 + digit;

                num = num /10;
            }
            System.out.print("After Reverse : "+ reverse);

    }
}
