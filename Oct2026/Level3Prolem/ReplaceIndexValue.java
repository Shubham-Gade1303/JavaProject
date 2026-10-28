package Oct2026.Level3Prolem;

import java.util.Scanner;

public class ReplaceIndexValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.print("Enter Arrays: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Index: ");
        int index = sc.nextInt();
        System.out.print("Value: ");
        int value = sc.nextInt();


        if(index >=0 && index < arr.length){
        
                arr[index] = value; 
            
        }else {
            System.out.print("invalid index");
        }
        System.out.print("Output: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
