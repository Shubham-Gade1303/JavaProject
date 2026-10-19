package Oct2026.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAliceAfterSortingArray{
    public List<Integer> targetAlice(int[] arr, int target){

        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                list.add(i);
            }
        }
        return list;
        
    }
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();


        FindAliceAfterSortingArray obj = new FindAliceAfterSortingArray();
        List<Integer>result = obj.targetAlice(arr, target);


        System.out.println(result);

    }
}