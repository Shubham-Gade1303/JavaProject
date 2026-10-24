package Oct2026.Level1Problem;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 20;
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found  ");
        }else{
            System.out.println("Element is not present in array: ");
        }
    }
}
