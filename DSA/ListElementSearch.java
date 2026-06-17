import java.util.*;
import java.util.List;
public class ListElementSearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int key = 6;
        System.out.println("Linear search: "+ list.contains(key));

        int index = Collections.binarySearch(list,key);
        if(index>=0){
            System.out.println("Element found :"+ index);
        }
        else{
            System.out.println("Element not found: ");
        }
    }
}
