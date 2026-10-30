package Nov2026.Infosys;

import java.util.Scanner;

public class SmallestBase {
    public static int smallBase(int num){
        for(int base =2; base <=num;base++){
            int n = num;

            int digit = n % base;
            boolean same = true;

            while(n > 0){
                int current = n % base;

                if(current != digit){
                    same = false;
                    break;
                }

                n = n /base;
            }

            if(same){
                return  base;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            System.out.print(smallBase(num));
    }
}
