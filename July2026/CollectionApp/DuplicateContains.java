package July2026.CollectionApp;

import java.util.Scanner;



public class DuplicateContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size  = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter Array: ");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    found = true;
                    break;
                }   
            } 
        }
        if(found){
            System.out.println("Duplicate found...");
        }
        else{
            System.out.println("Not found");
        }
       
    }
}
