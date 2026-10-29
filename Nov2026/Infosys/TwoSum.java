package Nov2026.Infosys;

import java.util.Scanner;

public class TwoSum {

    public int[] twosum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Target: ");
        int target = sc.nextInt();

        TwoSum obj = new TwoSum();

        int[] result = obj.twosum(nums, target);

        System.out.println("Indexes: " + result[0] + ", " + result[1]);

        sc.close();
    }
}