package Sep2026.DSA;

import java.util.Scanner;

public class countDuplicate {
    public static void duplicate(String str ){
        int[] count = new int[256];
        for(char ch : str.toCharArray()){
            count[ch]++;
        }

        System.out.println("Duplicate Characters: ");
        for(int i=0;i<256;i++){
            if(count[i]> 1){
            System.out.print((char)i + " : "+ count[i]);
            }
        }
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();

        duplicate(str);

    }
}
