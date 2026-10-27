package Oct2026.Level3Prolem;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                for(int j=i;j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
                break;
            }

        }
        
            for(int k=0;k<arr.length - 1;k++){
                System.out.print(arr[k] + " ");
            }
    }   

}
