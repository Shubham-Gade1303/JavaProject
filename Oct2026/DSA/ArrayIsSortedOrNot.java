package Oct2026.DSA;

public class ArrayIsSortedOrNot {
    static boolean isSorted(int[] arr){
        int n = arr.length;

        for(int i=1;i<n;i++){
            if(arr[i -1] > arr[i]){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args){

        int[] arr = {10,20,30,40,50};
        int n = arr.length;

        if(isSorted(arr)){
            System.out.println("True\n");

        }else{
            System.out.println("False\n");
        }

    }
}
