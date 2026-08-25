package August2026.MAP;

import java.util.Scanner;

public class SumProductOfDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;
        int pro =1;
        int temp =n;

        while(temp != 0){
            int digit = temp % 10;
            sum = sum + digit;
            pro = pro * digit;

            temp =   temp /10;
        }

        int total = sum + pro;

        if(n % total ==0 ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}