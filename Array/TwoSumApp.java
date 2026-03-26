package Array;
import java.util.*;
public class TwoSumApp {
    public static void main(String rags[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: " );
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter array elements:  ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("the index of target: "+ i + " "+j);
                    System.out.println("target is found : "+ target);
                    found = true;
                    break;
                }
            }
            if(found)break;
        }
        if(!found){
            System.out.println("Target not found in array.........");
        }
        sc.close();
    }
}
