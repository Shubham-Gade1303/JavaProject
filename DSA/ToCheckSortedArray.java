import java.util.Scanner;

public class ToCheckSortedArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean isSort =true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
            isSort=false;
            break;
            }
            
        }
        if(!isSort){
            System.out.println("Array is Not sorted..");
        }else{
            System.out.println("Array is sorted...........");
        }
    }
}
