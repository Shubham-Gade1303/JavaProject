package August2026;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int count =0 ;

            if(num == 0){
                count = 0;
            }else if( num !=0 ){
                num = Math.abs(num);

                while(num != 0){
                    num = num /10;
                    count++;
                }
            }
            System.out.println("total digits: "+ count);
    }
}
