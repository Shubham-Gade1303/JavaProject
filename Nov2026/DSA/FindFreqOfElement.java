package Nov2026.DSA;

import java.util.HashMap;
import java.util.Map;

public class FindFreqOfElement{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1,3,4,};

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.print(map);
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findTheDistanceValue'");
    }
}