package Oct2026;

import java.util.HashMap;

public class LongestSubarraySumK {
    public  static int longSubArray(int[] arr , int target){
        HashMap <Integer, Integer> map = new HashMap<>();
        
        int preSum =0;
        int maxLength=0;

        map.put(0,-1);
        for(int i =0;i<arr.length;i++){
            preSum = preSum + arr[i];

            if(map.containsKey(preSum - target)){
                int length  = i - map.get(preSum - target);
                maxLength = Math.max(maxLength, length);


            }

            if(!map.containsKey(preSum)){
                map.put(preSum,i);
            }

        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,2};
        int target = 6;

        int output = longSubArray(arr, target);

        System.out.println("OutPut: "+ output);
    }
}

