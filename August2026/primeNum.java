package August2026;

import java.util.Scanner;

public class primeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if(num <=1){
            isPrime = false;

        }else{
            for(int i=2;i<=num/2;i++){
                if(num % i ==0){
                    isPrime= false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Number is Prime: "+ num);

        }else{
            System.out.println("Number is not prime: "+ num);
        }
    }
}