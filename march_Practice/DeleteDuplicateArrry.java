package march_Practice;
import java.util.Scanner;
public class DeleteDuplicateArrry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: " );
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array: ");
        for(int i=0;i<size ;i++){
            arr[i] = sc.nextInt();
        }
        int j =0;

        for(int i =0;i<size-1;i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[size-1];
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
