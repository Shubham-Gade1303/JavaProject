package Nov2026.Infosys;

import java.util.Scanner;

import August2026.primeNum;

public class PrimeNumberCheck {

    public static boolean primeNum(int num){
       if(num <= 1){
        return false;
       }

       for(int i=2;i*i<=num;i++){
        if(num % i == 0 ){
            return false;
        }
       }
       return true;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if(primeNum(num)){
            System.out.print("Prime num ");
        }else{
            System.out.print("Not Prime number");
        }

    }
}
