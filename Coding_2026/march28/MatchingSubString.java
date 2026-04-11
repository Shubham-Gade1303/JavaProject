package March_2026.march28;
import java.util.*;
public class MatchingSubString{

    public static void main(String[] args){
        String[] s = {"mass","as","hero", "superhero"};
        List<String> result = new ArrayList<>();
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++){
                if(i != j && s[j].contains(s[i])){
                    result.add(s[i]);
                }
            }
        }
        System.out.print(result);        
    }
}
 