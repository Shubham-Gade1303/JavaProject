package August2026;

import java.util.Scanner;

public class findDuplicat {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Arayy elements: ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("duplicate elements: ");

        for(int i=0; i < arr.length; i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }



    }
}
