package march_Practice;
import java.util.*;

public class UsingMapMNonRep {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3,3,4,5,5,5,5};
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : arr){
            if(map.get(num) == 1)   
                System.out.print(num);
            
        }
    }
}