package Oct2026.Level4Problem;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        
        int[]  arr = new int[size];

        System.out.print("Input: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Output: ");
        for(int i = arr.length-1;i>= 0;i--){
        System.out.print(arr[i] + " ");
        }
    }
}
