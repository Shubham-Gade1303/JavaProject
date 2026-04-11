package March_2026.march29;
import java.util.*;
public class serachElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arrays size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        boolean isfound = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                isfound = true;
                break;
            }
        }
        if(isfound){
            System.out.println("Value found in array ");
        }else{
            System.out.println("Not found ");
        }
    }
}