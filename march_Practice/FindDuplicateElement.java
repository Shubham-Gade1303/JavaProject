package march_Practice;

import java.util.Arrays;

public class FindDuplicateElement {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};

        Arrays.sort(arr);

        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
