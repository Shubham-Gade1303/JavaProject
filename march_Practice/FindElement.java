package march_Practice;

import java.util.*;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        boolean isFound = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found in array... "+ target + "index of element is: "+ i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element is not found in array........");
        }


    }
    
}
