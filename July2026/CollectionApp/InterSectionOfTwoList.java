package July2026.CollectionApp;

import java.util.ArrayList;
import java.util.Scanner;

public class InterSectionOfTwoList {

    public int[] interSection(int[] list1, int[] list2){
        ArrayList<Integer> app = new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i] == list2[j]  && !app.contains(list1[i])){
                    app.add(list1[i]);
                }
            }
        }

        int[] ans= new int[app.size()];
        for(int i=0;i<app.size();i++){
            ans[i] = app.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size for first List: ");
        int size1 = sc.nextInt();
        int[] list1 = new int[size1];
        System.out.print("Enter List1 Elements: ");
        for(int i=0;i<size1;i++){
            list1[i] = sc.nextInt();
        }

        System.out.print("Enter Size1 for List2: ");
        int size2 = sc.nextInt();
        int[] list2 = new int[size2];
        System.out.print("Enter LIst2 Elements: ");
        for(int i =0;i<size2;i++){
            list2[i] = sc.nextInt();
        }
        InterSectionOfTwoList obj = new InterSectionOfTwoList();
        int[] ans = obj.interSection(list1, list2);
        for(int num : ans){
            System.out.print(num+ " ");
        }

    }
}
