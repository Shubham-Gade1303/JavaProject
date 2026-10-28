package Oct2026.Level3Prolem;

import java.util.Scanner;

public class LeftShiftElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array Element: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter first Element: ");
        int first = sc.nextInt();

        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];

        }
        arr[arr.length -1] = first;

        System.out.print("Output : ");
        for(int i=0;i <arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
