package Nov2026.DSA;
import java.util.*;

public class RemoveDuplicate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        System.out.println("After removing duplicates:");

        for (int num : set) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}