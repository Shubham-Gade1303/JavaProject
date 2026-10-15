package Oct2026.DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubArrayeDistElement{
    public int sumCount(List<Integer> nums){


        int ans =0;
        int n = nums.size();

        for(int i=0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            
            for(int j =i;j<n;j++){
                set.add(nums.get(j));

                int dist = set.size();

                ans += dist*dist;
            }
        }
        return ans;
    }


    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1,2,1);

        SubArrayeDistElement obj = new SubArrayeDistElement();

        int result = obj.sumCount(nums);

        System.out.println(result);
    }
}