package Oct2026.Level1Problem;

public class FisrtOcc {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,1,2,3,4,5,6,7,8,9};

        int target = 6;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.print("First Occ : " + i);
                break;
            }
        }
    }
}
