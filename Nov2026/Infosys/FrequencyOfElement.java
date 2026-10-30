package Nov2026.Infosys;

import java.util.HashMap;

public class  FrequencyOfElement{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,2};


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num : map.keySet()){
            System.out.println(num +  " --> " + map.get(num));
        }

    }

}