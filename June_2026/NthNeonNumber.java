package June_2026;

import java.util.Scanner;

public class NthNeonNumber {

    public static Neonnumsr(int n){
        
        for(int i=1;i<n;i++){
            int square = i *i;
            int sum =0;

            while(square>=0){
                sum = sum + square %10;
                square = square /10;
            }
            if(sum == i) return i;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        System.out.println();
    }
}
