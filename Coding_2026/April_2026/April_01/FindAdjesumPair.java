package Coding_2026.April_2026.April_01;

import java.util.Scanner;

public class FindAdjesumPair{
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter Array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int sum = arr[i] + arr[i+1];
            System.out.println(arr[i] +" + "+arr[i+1] + " = " + sum );
        }
    }

}