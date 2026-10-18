package Oct2026.DSA;

public class RemoveElementUsingTwoPointer {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target =6;

        int k =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != target){
                arr[k] =arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
