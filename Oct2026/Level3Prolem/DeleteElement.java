package Oct2026.Level3Prolem;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        int target = sc.nextInt();

        for(int i=0;i<list.size();i++){
            if(list.get(i) == target){
                list.remove(i);
                break;
            }
        }

        System.out.print(list + " ");
    }    
}
