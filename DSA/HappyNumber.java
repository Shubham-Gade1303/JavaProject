import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public boolean isHappy(int n ){
        HashSet <Integer> set = new HashSet<>();
        while(n !=1 && !set.contains(n)){
            set.add(n);
            int sum =0;

            while(n>0){
                int d = n %10;
                sum = sum + d*d;
                n = n /10;

            }
            n = sum;
        }
        return n==1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HappyNumber obj  = new HappyNumber();
        boolean result = obj.isHappy(n);
        System.out.println(obj.isHappy(n));
    
    }
}
