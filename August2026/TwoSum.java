package August2026;

import java.util.Scanner;

public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.err.print("Enter Array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+ arr[j] == target){
                    System.out.println(arr[i]+ " + "+ arr[j] + " = " + target);
                    found = true;

                }
            }
        }
        if(!found){
            System.out.print("Pair of the target sum is not found: ");
        }
    }
}