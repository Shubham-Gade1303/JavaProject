package July2026;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class CountVowelAndCon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int vowel =0;
        int con=0;
        char[] ch = s.toCharArray();

      for(int i=0;i<ch.length;i++){
        if(Character.isLetter(ch[i])){
            if(ch[i] == 'a' || ch[i] =='e' || ch[i] == 'i' || ch[i] == 'o' || ch[i]== 'u'){
                vowel++;
            }
            else{
                con++;
            }
        }
      }
 
        System.out.println(vowel);
        System.out.println(con);
    }
}