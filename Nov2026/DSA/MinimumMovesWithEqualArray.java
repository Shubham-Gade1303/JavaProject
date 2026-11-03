    package Nov2026.DSA;

import java.util.Arrays;
import java.util.Scanner;

class MinimuMovesWithEqualArray{
    public static  int minArray(int[] nums){

        Arrays.sort(nums);

        int m = nums[nums.length/2];
        int moves=0;

        for(int i=0;i<nums.length;i++){
            moves += Math.abs((long) nums[i] - m);
        }

        return (int) moves;
    }



        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] nums = {1,2,3};

            int result = minArray(nums);

            System.out.print(result);

        }
    }