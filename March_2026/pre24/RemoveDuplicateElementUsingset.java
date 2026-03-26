package March_2026.pre24;
import java.util.*;
public class RemoveDuplicateElementUsingset {
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,4,5,2,3,4};
       
       Set<Integer> set = new HashSet<>();
       for(int i :arr){
        set.add(i);

       }
       System.out.print(set);
    }
}
