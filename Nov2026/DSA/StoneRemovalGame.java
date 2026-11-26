package Nov2026.DSA;

import java.util.Scanner;

public class StoneRemovalGame {
    public boolean canALicewin(int n){
        int remove=10;
        int count =0;

        while(n >=remove){
            n = n - remove;
            remove--;
            count++;
        }
        return count % 2 ==1;
    }
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter: ");
            int n = sc.nextInt();

        StoneRemovalGame obj = new StoneRemovalGame();
        boolean result = obj.canALicewin(n);
        System.out.print(result);
         
    }
}
