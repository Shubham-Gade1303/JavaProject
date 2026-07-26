package July2026.CollectionApp;

import java.util.*;

public class GroupOfAnagram {
    public List<List<String>> groupAnagramList(String[] s){
        Map<String, List<String>> map = new HashMap<>();


        for(String word : s){
            
        }

    }
    



    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        String[] s = new String[size];
       for(int i = 0;i<size;i++){
        s[i] = sc.next();
       }
       System.out.print("Entered Group of String: ");
       for(int i=0;i<size;i++){
       System.out.print(s[i]+" ");
       }


    }
}
