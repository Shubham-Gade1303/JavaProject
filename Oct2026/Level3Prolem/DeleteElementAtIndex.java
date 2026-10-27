package Oct2026.Level3Prolem;

import java.util.Scanner;

public class DeleteElementAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int[] arr  =new int[size];
        System.out.print("Enter Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index: ");
        int index = sc.nextInt();


        if(index >= 0 && index < arr.length){
            for(int i=0;i< arr.length-1;i++){
                arr[i] = arr[i+1];

            }
            System.out.print("Output: ");
            for(int j =0;j<arr.length-1;j++){
                System.out.print(arr[j]+ " ");
            }
        }else{
            System.out.println("invalid index.");
        }
    }
}
