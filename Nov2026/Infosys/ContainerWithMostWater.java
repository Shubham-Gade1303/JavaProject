package Nov2026.Infosys;

import java.util.Scanner;

public class ContainerWithMostWater {
    public  int maxArea(int[] nums){
        int left =0;
        int right = nums.length-1;

        int maxWater =0;

        while(left < right){
            int width = right - left ;
            int h = Math.min(nums[left], nums[right]);

            int area = width *h;

            maxWater = Math.max(maxWater, area);

            if(nums[left] < nums[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,8,6,2,5,4,8,3,7};

        ContainerWithMostWater obj = new ContainerWithMostWater();
        int result = obj.maxArea(nums);
        System.out.print("result: "+ result);
    }
}
