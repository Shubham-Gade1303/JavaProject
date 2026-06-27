import java.util.ArrayList;
import java.util.Arrays;

public class DeleteLastElemet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
        System.out.print("Before detele: ");
        for(int num : list){
            System.out.print(num + " ");
        }

        list.remove(list.size()-1);
        System.out.print("\nAfter delete Last element: ");
        for(int num : list){
            System.out.print(num+" ");
        }
        
    }
}
