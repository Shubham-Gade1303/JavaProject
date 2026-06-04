package June_2026;

import java.util.Scanner;

public class secondMAx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size= sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int SeconfAmx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                 SeconfAmx =max;
                max = arr[i];
            }
            else if(arr[i] > SeconfAmx && arr[i] != max)
                SeconfAmx= arr[i];  
            
        }
        System.out.println("Second max value: "+ SeconfAmx);
    }
}
