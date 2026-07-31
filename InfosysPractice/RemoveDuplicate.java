package InfosysPractice;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }


        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.print(set);

    }
}
