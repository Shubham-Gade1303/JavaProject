package Nov2026.Infosys;

import java.util.Scanner;

public class ClimbStairs {
    public int climb(int n){
        if(n <-2){
            return n;
        }

        int p1 =2;
        int p2 =1;
        int c =0;

        for(int i =3;i<=n;i++){
            c = p1+p2;
            p2 = p1;
            p1=c;

        }
        return c;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Staris: ");
        int n = sc.nextInt();

        ClimbStairs obj = new ClimbStairs();

        int result = obj.climb(n);
        System.out.print("Result: "+result);
    }
}
