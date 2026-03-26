package march_Practice;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        int org = num;
        int sum =0;

        while (num>0) {
            int digit = num % 10;
            sum = sum +(digit*digit*digit);
            num = num /10;
        }
        if(sum == org){
            System.out.println("Number is ArmStrong: "+ org);
        }else{
            System.out.println("Number is Not ArmStrong: "+ org);
        }

    }
}
