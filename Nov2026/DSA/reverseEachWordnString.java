package Nov2026.DSA;

import java.util.Scanner;

public class reverseEachWordnString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String s = sc.nextLine();

        String[] w = s.split(" ");
        for(String d : w){
            StringBuilder sb = new StringBuilder(d);
            System.out.print(sb.reverse() + " ");
        }
    }
}