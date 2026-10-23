package Oct2026.DSA;

import java.util.Scanner;
public class MaximumKToSortingPermutation{
    public int sortPermutation(int[] nums){


        int k = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                k = k & nums[i];
            }
        }
        return Math.max(k, 0);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.print("Enter Array: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        MaximumKToSortingPermutation obj = new MaximumKToSortingPermutation();
        int result = obj.sortPermutation(nums);
        System.out.print(result);



    }
}