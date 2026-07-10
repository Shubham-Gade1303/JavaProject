package July2026.CollectionApp;

import java.util.*;
public class CountUniqueElemet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : list){
            set.add(num);
        }
        System.out.print(set.size() +" ");
    }

}