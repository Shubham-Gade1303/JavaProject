package InfosysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter element: ");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }

        Arrays.sort(arr);
        int large = arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] != large){
                System.out.println(arr[i]+ " "+ " second large elemnt..");
                return;
            }
        }
    }
}
