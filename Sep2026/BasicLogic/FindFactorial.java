package Sep2026.BasicLogic;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factorial =1;
        for(int i =0;i<num;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial + " of this number "+ num);
    }
}
