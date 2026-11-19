package Nov2026.DSA;

import java.util.Arrays;

public class MinimumScoreByChangingTwoElement{
    public int minimizeSum(int[] nums){
Arrays.sort(nums);
        int n = nums.length;

        int o1 = nums[n-1]-nums[2];
        int o2 = nums[n-2]-nums[1];
        int o3 = nums[n-3]-nums[0];

        return Math.min(o1, Math.min(o2, o3));
    }
    

    public static void main(String[] args){
        
        int[] nums = {1,4,7,8,5};

        MinimumScoreByChangingTwoElement obj = new MinimumScoreByChangingTwoElement();
        int result = obj.minimizeSum(nums);
        System.out.print(result+" ");
    }
}