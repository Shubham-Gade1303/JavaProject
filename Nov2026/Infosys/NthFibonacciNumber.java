package Nov2026.Infosys;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static int fibonacci(int num){

        if(num ==0){
            return 0;
        }

        if(num ==1){
            return 1;
        }   
            int a =0;
            int b =1;


            for(int i=2;i<=num;i++){
                int c = a+b;

                a=b;
                b=c;
            }
            return b;

    }
    


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int result = fibonacci(num);
        System.out.print("result: "+ result);


    }
}
