package August2026;

import java.util.Scanner;

public class checkNumberLarge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 =sc.nextInt();

        System.out.print("Num2: ");
        int num2 =sc.nextInt();

        System.out.print("Num3: ");
        int num3 =sc.nextInt();

        if(num1 >= num2 &&  num1 >= num3){
            System.out.println(num1 + " is large");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.print(num2 + " is large number");
        }else{
            System.out.print(num3 + " is large");
        }
    }
}