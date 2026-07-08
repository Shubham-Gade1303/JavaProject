package July2026;

import java.util.Scanner;

public class FindDuplicate {
    public static int Duplicate(int[] arr){
        int slow =arr[0];
        int fast = arr[0];

        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow != fast);
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];

        }
        return slow;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
       // Duplicate(arr);
        System.out.print("Duplicate Element: "+Duplicate(arr));
    }
}
