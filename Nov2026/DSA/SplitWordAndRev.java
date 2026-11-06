package Nov2026.DSA;

import java.util.Scanner;

public class SplitWordAndRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String s = sc.nextLine();

        String[] words = s.split(" ");

        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i] + " ");
        }
    }
}
