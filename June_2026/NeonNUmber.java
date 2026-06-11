package June_2026;

import java.util.Scanner;

public class NeonNUmber {

    public static boolean CheckNeon(int n ){
        int s = n*n;
        int sum =0;

        while(s>0){
            sum = sum + s % 10;
            s = s /10;

        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(CheckNeon(n)){
            System.out.println("the number is Neon number: "+ n);
        }
        else if(!CheckNeon(n)){
            System.out.println("The number is not Neon : "+ n);
        }


    }
}
