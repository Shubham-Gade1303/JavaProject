
import java.util.*;
public class UNiE{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elemnt: ");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // for(int i=0;i<arr.length;i++){
        //     int count=0;

        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //         }
        //     }

        //     if(count ==1){
        //         System.out.println("UNique Elemt is : "+ arr[i] + " ..");
        //         break;
        //     }
        // }

        int Unique = 0;
        for(int i=0;i<arr.length;i++){
            Unique = Unique^arr[i];

        }
        System.out.println("Unique elemt is : "+ Unique);

    }
}