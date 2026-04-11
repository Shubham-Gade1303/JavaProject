import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

       int[] nums = {100,4,200,2,1,3};

       for(int num : nums){
        set.add(num);
       }
       int longest =0;
       for(int num :set){
       if(!set.contains(num-1)){
        int currentnum =num;
        int count=1;

        while(set.contains(num+1)){
            currentnum++;
            count++;
        }
        longest = Math.max(count, longest);
       }
       }
       System.out.println(longest);



    }
}