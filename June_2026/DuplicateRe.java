package June_2026;

import java.util.LinkedHashSet;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class DuplicateRe {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,5,6,6,2,2,8,9,10};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.print(set);
    }
}
