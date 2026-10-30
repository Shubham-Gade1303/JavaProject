package Nov2026.Infosys;

import java.util.Scanner;

public class BinarySearch {
    public int search(int[] nums, int Target){
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == Target){
        //         return i;
        //     }
        // }  this is not optimal solution 


        int left =0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left) /2;

            if(nums[mid] == Target){
                return mid;
            }

            if(nums[mid] < Target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter Array: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Target: ");

        int Target = sc.nextInt();

        BinarySearch obj = new BinarySearch();
        int result = obj.search(nums, Target);
        System.out.print("Result : "+ result);
    }
}
