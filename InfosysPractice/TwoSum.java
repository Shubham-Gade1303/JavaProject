package InfosysPractice;

import java.util.Scanner;

public class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter Number of two num sume; ");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+ arr[j]== target){
                    System.out.print(arr[i]+" "+ arr[j]+" "+ target);
                }
            }
        }
    }
}