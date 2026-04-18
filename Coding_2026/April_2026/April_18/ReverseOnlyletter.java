
package Coding_2026.April_2026.April_18;
import java.util.*;
public class ReverseOnlyletter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr String: ");

        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int i=0,j=ch.length-1;

        while (i<j) {
            if(!Character.isLetter(ch[i])){
                i++;
            }else if(!Character.isLetter(ch[j])){
                j--;
            }else{
                char temp = ch[i];
                ch[i]= ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            
        }
        System.out.println("new String: "+new String(ch));
    }
}