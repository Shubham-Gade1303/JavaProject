package Coding_2026.April_2026.April_01;

import java.util.Scanner;

public class CountEvenNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 ==0)
                count++;
            
        }
        System.out.println("count of even numbers: "+ count);
        
    }
}
