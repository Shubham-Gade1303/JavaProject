package August2026;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of terms: ");
        int num = sc.nextInt();

        int f =0;
        int s  =1;
        System.out.print("fibonacci " );
        for(int i=1;i<=num;i++){
            System.out.print(f + " ");
            int next = f +s;
            f = s;
            s = next;
        }
    }
}