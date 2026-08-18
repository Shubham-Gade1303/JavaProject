package August2026;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number: ");
        int num = sc.nextInt();

        int sum =0;

        while(num !=0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;

        }
        System.out.print("sum of digit: " + sum);

    }
}
