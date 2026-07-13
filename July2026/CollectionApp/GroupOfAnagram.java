package July2026.CollectionApp;

import java.util.Scanner;

public class GroupOfAnagram {
    



    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        String[] s = new String[size];
       for(int i = 0;i<size;i++){
        s[i] = sc.next();
       }
       for(int i=0;i<size;i++){
       System.out.print(s[i]+" ");
       }
    }
}
