import java.util.Arrays;
import java.util.Scanner;
public class LongestSubstring {
    static  String LongestString(String[] arr){
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length-1];
        int maxLen = Math.min(first.length(), last.length());

        int i=0;
        while(i<maxLen && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0, i);
    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.print("Enter String: ");
        
        for(int i=0;i<5;i++){
            arr[i] = sc.next();
        }
        
        System.out.println(LongestString(arr));
    }
}
