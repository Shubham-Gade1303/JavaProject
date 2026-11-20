package Nov2026.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public  class ArrayAfterMofification{
    public int  MaxSelectedElement(int[] nums){
        Arrays.sort(nums);

        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 0;

        for(int num : nums){
            int c1 = dp.getOrDefault(num, 1)+1;
            int c2 = dp.getOrDefault(num - 1, 0) + 1;


            dp.put(num + 1, Math.max(dp.getOrDefault(num + 1, 0), c1));
            dp.put(num , Math.max(dp.getOrDefault(num, 0), c2));

            ans = Math.max(ans, Math.max(c1, c1));

        }

        return ans;
    }



    public static void main(String[] args){
        int[] nums = {2,1,5,1,1};

        ArrayAfterMofification obj = new ArrayAfterMofification();

        int result = obj.MaxSelectedElement(nums);

        System.out.print(result);

    }
    
}