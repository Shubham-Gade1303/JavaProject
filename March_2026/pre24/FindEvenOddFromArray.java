package March_2026.pre24;
import java.util.*;
public class FindEvenOddFromArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Even number: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 ==0){
                System.out.print(arr[i]+ " ");
           
         }
        }
        System.out.println();
        System.out.print("Odd number: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
