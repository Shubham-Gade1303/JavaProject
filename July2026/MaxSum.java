package July2026;

import java.util.*;
public class MaxSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int sum = arr[0];
        int currentSum = arr[0];

        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            sum = Math.max(sum, currentSum);
        }
        System.out.println(sum);
    }
}