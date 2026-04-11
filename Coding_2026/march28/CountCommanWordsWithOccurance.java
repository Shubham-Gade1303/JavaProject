package March_2026.march28;
import java.util.*;
public class CountCommanWordsWithOccurance {
    public static void main(String[] args) {
        String[] word1 = {"leetcode","is","amazing","as","is"};
        String[] word2 = {"amazing", "is", "leetcode"};


        HashMap<String, Integer > map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(String w : word1){
            map1.put(w, map1.getOrDefault(w,0 )+1);
        }

        for(String w : word2){
            map2.put(w,map2.getOrDefault(w,0)+1);
        }
        int count =0;
        for(String key : map1.keySet()){
            if(map1.get(key) ==1 && map2.getOrDefault(key, 0)==1){
                count++;
            }
        }
        System.out.print(count);
    }   
}
