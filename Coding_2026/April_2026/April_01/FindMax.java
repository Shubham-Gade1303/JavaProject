package Coding_2026.April_2026.April_01;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("Max array: " + max);
    }
}
