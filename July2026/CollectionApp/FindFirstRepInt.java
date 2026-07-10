package July2026.CollectionApp;

import java.util.ArrayList;
import java.util.Scanner;

public class FindFirstRepInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list =  new ArrayList<>();
        System.out.print("Enter Size: ");
        int Size = sc.nextInt();
        System.out.print("Enter List element: ");
        for(int i=0;i<Size;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        int firstRep = -1;
        for(int i=0;i<list.size();i++){
            for(int  j = i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    firstRep = list.get(i);
                    break;
                }
            }

            if(firstRep != -1){
                break;
            }
        }

        if(firstRep != -1){
            System.out.println("First Repeated Integer found: " + firstRep);
        }else{
            System.out.println("Forst Reapled Integr not found: ");
        }
    }
}
