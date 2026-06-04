package June_2026;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array elemet: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        
    }
}
