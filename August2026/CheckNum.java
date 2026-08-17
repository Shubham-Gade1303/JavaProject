package August2026;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("num is positive");

        }else if(num < 0 ){
            System.out.println("number is negative");
        }else{
            System.out.println("zero");
        }
    }
}
