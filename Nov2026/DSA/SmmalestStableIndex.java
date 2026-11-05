package Nov2026.DSA;

import java.util.Scanner;

public class SmmalestStableIndex {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] right = new int[n];

        right[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.min(nums[i], right[i+1]);

        }

        int left = nums[0];
        for(int i=0;i<n;i++){
            left = Math.min(left, nums[i]);

            int score = left - right[i];

            if(score <=k){
                return i;

            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Numbers: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("K: ");
        int k = sc.nextInt();

        SmmalestStableIndex obj = new SmmalestStableIndex();
        int result = obj.firstStableIndex(nums, k);

        System.out.print("Output: "+ result);
    }
}

