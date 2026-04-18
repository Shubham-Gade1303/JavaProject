package RSL_Pracice;
import java.util.Map.Entry;
import java.util.*;

import javax.print.StreamPrintService;
public class TwoStringConcating {
        public static void main(String[] args) {
          //  Scanner sc = new Scanner(System.in);

          String s1 ="art",s2="work";
          int ind1 = 0, ind2=0;

          StringBuilder sb = new StringBuilder();

          int len = Math.min(s1.length(), s2.length());
          for(int i =0;i<len;i++){
            if(s1.charAt(i)!='a' || s1.charAt(i)!='e' || s1.charAt(i)!= 'i' || s1.charAt(i)!='o' || s1.charAt(i)!='u'){
                sb.append(s1.charAt(i));
            }
            if(s2.charAt(i)!= 'a' || s2.charAt(i)!='e' || s2.charAt(i)!= 'i'|| s2.charAt(i)!='o'|| s2.charAt(i) !='u'){
                sb.append(s2.charAt(i));
            }
          }

          if(len!=s1.length()){
            for(int i=len;i<s1.length();i++){
                sb.append(s1.charAt(i));
            }
          }

          if(len!=s2.length()){
            for(int i=len;i<s2.length();i++){
                sb.append(s2.charAt(i));
            }
          }

          System.out.println(sb.toString());
          LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
          for(char c : sb.toString().toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
          } 

          for(Entry<Character, Integer>e:map.entrySet()){
            if(e.getValue()>1){
            System.out.println(e.getKey());
            }
          }

        }
}
