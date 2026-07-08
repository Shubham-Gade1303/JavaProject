package July2026;

import java.util.Scanner;

public class RotateArray {
    public static void reverse(int[] arr , int s, int e){
        while (s<e){
            int temp = arr[s];
            arr[s]= arr[e];
            arr[e]= temp;
            s++;
            e--;
        
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter Array: ");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        System.out.print("Enter K Value: ");
        int k =sc.nextInt();

        int n = arr.length;
        k=k%n;

        reverse(arr, 0, k-1);//reverse(arr , 0,n-1);

        reverse(arr, k, n-1);// reverse(arr,0, k-1);
    
        reverse(arr, 0, n-1);// reverse(arr,k,n-1);


        System.out.print("After Rotate: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        

    }
}
