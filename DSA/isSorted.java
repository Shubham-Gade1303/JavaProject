import java.util.Scanner;

public class isSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;

        for(int i =1;i<arr.length;i++){
            if(arr[i-1]> arr[i]){
           isSorted = false;
           break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted.");
        }else{
            System.out.println("Array is not sorted..");
        }
       
            
    }
}