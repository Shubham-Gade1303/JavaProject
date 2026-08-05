package August2026;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicate {
    public int findDupli(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        for(int num : arr){
            if(!seen.add(num)){
                return num;
            }

        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        System.out.print("Enter Array: ");
        for(int i=0;i<Size;i++){
            arr[i] = sc.nextInt();
        }

        FindDuplicate obj = new FindDuplicate();
        System.out.print( "Duplicate Element: "+obj.findDupli(arr));
    }
}
