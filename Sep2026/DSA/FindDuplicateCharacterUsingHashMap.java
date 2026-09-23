package Sep2026.DSA;

import java.security.Key;
import java.text.NumberFormat.Style;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacterUsingHashMap {

    public static void duplicate(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
           
        }
        System.out.println("Duplicate characterr: ");
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " : " + entry.getValue() );
            }
        }

    }
    public static void main(String[] args){
        String str = "programming";

        duplicate(str);

    }
}
