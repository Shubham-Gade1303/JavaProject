package Sep2026.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicteCount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,1,2,3,8};

        Map<Integer,Integer> result = new TreeMap<>();
        for(int num : arr){
            result.put(num, result.getOrDefault(num, 0)+1);

        }
        System.out.println(result);

    }
}
