import java.util.*;

public class MultiplyWithAdjecunt {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENter Size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("ENtr array: ");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    
    int prev =1;
    int curr = arr[0];

    for(int i=0;i<arr.length;i++){
        int next = (i==n-1) ? 1 : arr[i+1];
        arr[i]= prev * curr* next;
            prev = curr;
            curr= next;
    }
    System.out.print(Arrays.toString(arr));
    }

}
