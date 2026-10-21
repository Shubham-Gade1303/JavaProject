package Oct2026.DSA;
import java.util.*;

public class MoveZerosToEnd{

    public static  void  moveZero(int[] arr, int index){

        for(int num : arr){
            if(num != 0){
                arr[index++] = num;
            }
        }

        while(index < arr.length){
            arr[index++] =0;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int index = 0;


        int[] arr = new int[size];
        System.out.print("Enter Array element: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        moveZero(arr,0);
        System.out.print("After Move Zeros: ");

        for(int num : arr){
            System.out.print(num +" ");
        }



    }
}