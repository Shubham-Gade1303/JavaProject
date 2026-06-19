import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosLast {
    public static void MovetoLat(int[] arr){
       
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Entre size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Entre array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        MovetoLat(arr);
        System.out.println(Arrays.toString(arr));
    }
}
