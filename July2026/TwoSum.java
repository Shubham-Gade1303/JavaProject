package July2026;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Eneter Array: ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Sum: ");
        int taregt = sc.nextInt();

        boolean found = false;

        for(int i=0;i<size;i++){
            for(int j =i+1;j<size;j++){
                if(arr[i]+ arr[j] == taregt){
                    System.out.print("\nIndexs: "+ i +" "+ j);
                    System.out.print("\nPair: "+  arr[i]+" "+ arr[j]);
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("Pair of sum is not present in Array...");
        }
    }
}
