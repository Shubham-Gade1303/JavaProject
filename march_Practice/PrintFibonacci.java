package march_Practice;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a =0 , b = 1;

        for(int i=0;i<n;i++){
            System.out.print(a+(i<n-1 ? " " : "\n"));
            int c = a + b ;
            a=b;
            b=c;

        }

    }
}
