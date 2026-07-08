package July2026;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;

        int exp = n *(n+1)/2;
        int act =0;

        for(int num : arr){
            act += num;
        }
        
        System.out.println(exp-act)
;    }
}
