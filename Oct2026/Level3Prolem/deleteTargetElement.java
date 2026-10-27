package Oct2026.Level3Prolem;

import java.util.Scanner;

public class deleteTargetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size =sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Element: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();


        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                for(int j =i ;j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
                break;
            }
        }

        for(int i=0;i<arr.length-1;i++){
            System.out.print( arr[i] + " ");
        }
    }
}
