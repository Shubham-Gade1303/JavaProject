package March_2026.pre24;
import java.util.*;
public class CountFreqOfEmelentUsingHashMap {
    public static void main(String[] args) {

    int[] arr = {1,1,2,2,3,3};

    HashMap <Integer, Integer> map = new HashMap<>();

    for(int i : arr){
        map.put(i, map.getOrDefault(i,0)+1);
    }
    System.out.print(map);

    }
}
