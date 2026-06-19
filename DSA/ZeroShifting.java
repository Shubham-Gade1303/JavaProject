import java.util.Arrays;
import java.util.Scanner;

public class ZeroShifting {
    public  static void segregate(int[] arr){
        int left =0;
        int right = arr.length-1;

        while(left <right){
            while(arr[left]==0 &&left < right ){
                left++;
            }
            while (arr[right] ==1 && left < right) {
                right--;
            }

            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
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

        segregate(arr);
        System.out.println(Arrays.toString(arr));
    }

}
