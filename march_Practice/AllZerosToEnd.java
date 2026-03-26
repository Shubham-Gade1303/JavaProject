package march_Practice;

import java.util.Scanner;

public class AllZerosToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int k =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[k++] = arr[i];
            }
        }

        while( k <arr.length){
            arr[k++]=0;
        }
        System.out.println("After remove to zero: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
