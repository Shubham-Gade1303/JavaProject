package August2026;

import java.util.Scanner;

public class largeNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter First num: ");
        int num1 = sc.nextInt();

        System.out.print("Ener second number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is large number");
        } else if( num2 > num1){
            System.out.println(num2 + " is large number ");
        }else{
            System.out.println("both are equal ");
        }
    }
}
