package Nov2026.DSA;

import java.util.Scanner;

public class CountCommasinRange {
    public  int count(int num){
        if(num < 1000){
            return 0;
        }
        return num -999;
    }
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();


CountCommasinRange obj = new CountCommasinRange();
int result = obj.count(num);
System.out.print("coutn of commas: "+ result);
        
       }
}
