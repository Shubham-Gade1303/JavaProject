package Sep2026.DSA;

import java.util.Scanner;

public class FindTheLargeMissingNumber {

    public int largeInteger(int[] arr, int k) {

        int n = arr.length;

        int[] count = new int[51];

        // Check every subarray of size k
        for (int i = 0; i <= n - k; i++) {

            boolean[] seen = new boolean[51];

            for (int j = i; j < i + k; j++) {

                int num = arr[j];

                if (!seen[num]) {
                    count[num]++;
                    seen[num] = true;
                }
            }
        }

        // Find the largest number that appears
        // in exactly one subarray
        int ans = -1;

        for (int num = 0; num <= 50; num++) {

            if (count[num] == 1) {
                ans = num;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("K: ");
        int k = sc.nextInt();

        FindTheLargeMissingNumber obj =
                new FindTheLargeMissingNumber();

        int result = obj.largeInteger(arr, k);

        System.out.println("Largest Almost Missing Integer: " + result);

        sc.close();
    }
}