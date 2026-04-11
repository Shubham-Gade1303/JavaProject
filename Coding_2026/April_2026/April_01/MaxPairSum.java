package Coding_2026.April_2026.April_01;
import java.util.*;
public class MaxPairSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int first = arr[0];
        int second = arr[1];


        int maxSum = arr[0]+ arr[1];
        for(int i =0;i<arr.length-1;i++){
            int sum = arr[i]+arr[i+1];
            if(sum > maxSum){
                maxSum=sum;
                first = arr[i];
                second=arr[i+1];
            }
//System.out.println(first+ " + " + second + " = " + maxSum);
        } 
         System.out.println(first+ " + " + second + " = " + maxSum);
    }
}
