/*  Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r */
import java.util.Scanner;
public class MergeAlternateString {
    public String MergerAlter(String s1, String s2){
        StringBuilder SB = new StringBuilder();
        int i=0;
        int j=0;
        while (i<s1.length() && j<s2.length()) {
            SB.append(s1.charAt(i++));
            SB.append(s2.charAt(j++));
        }
        while(i<s1.length()){
            SB.append(s1.charAt(i++));
        }
        while(j<s2.length()){
            SB.append(s2.charAt(j++));
        }
        return SB.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter String 1: ");
        String s1 = sc.next();

        System.out.print("Enter Second String: ");
        String s2 = sc.next();

        MergeAlternateString obj = new MergeAlternateString();
        String result = obj.MergerAlter(s1, s2);
            System.out.println(result);
    }
}
