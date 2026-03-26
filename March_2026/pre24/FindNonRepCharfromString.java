package March_2026.pre24;
import java.util.*;
public class FindNonRepCharfromString {
    public static void main(String[] args) {
        String s="aabbcde";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : map.keySet()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}
