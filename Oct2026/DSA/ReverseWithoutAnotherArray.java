package Oct2026.DSA;

import java.util.Scanner;

public class ReverseWithoutAnotherArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

    System.out.print("input: ");
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }

    int left = 0;
    int right = arr.length-1;

    while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    }
}
