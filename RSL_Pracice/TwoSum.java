
import java.util.*;

import javax.swing.text.StyledEditorKit;
public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Element: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();

        }

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
                for(int j =i+1;j<arr.length;i++){
                    if(arr[i]+arr[j]==target){
                    System.out.print(i+" "+ j + " = "+ target);
                    }
                    System.out.println("Not matching");
                }
                
        }
    }
}