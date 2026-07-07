package July2026;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class ReverseWordOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for(String w : words){
            for(int i= w.length()-1;i>=0;i--){
                ans.append(w.charAt(i));
            }
            ans.append(" ");
        }
        System.out.println(ans.toString().trim());
    }
}
