import java.util.*;
public class MedianOfTwoSoterdArray {
    public static void main(String[] args){
    
        int[] nums1 = {1,2};
        int[] nums2 ={3};
        int[] arr = new int[nums1.length+ nums2.length];

        int k=0;

        for(int i : nums1) arr[k++] =i;
        for(int i : nums2) arr[k++] =i;
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2 ==0){
            System.out.println((arr[n/2] + arr[n/2-1]) / 2.0);
        }
        else{
            System.out.println(arr[n/2]);
        }


    }
    
}