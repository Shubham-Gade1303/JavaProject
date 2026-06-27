import java.util.*;
public class RecusiveApToMax{
    // static int findMax(int[] arr, int i ){
    //     if(i == arr.length-1){
    //         return arr[i];
    //     }

    //     int recMax = findMax(arr, i+1);

    //     return Math.max(recMax, arr[i]);
    // }
    // static int large(int[] arr){
    //     return findMax(arr,0);
    // }

    static int large(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args){
        int[] arr = {20,202,400,500,101};

        System.out.print(large(arr));
    }
}