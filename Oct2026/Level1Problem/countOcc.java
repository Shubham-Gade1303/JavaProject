package Oct2026.Level1Problem;

public class countOcc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,1,2,3,4,5,6,77,1,1,1};
        int taregt = 1;
        int count =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == taregt){
                count++;
            }
        }

        System.out.println("total occ : "+ count);
    }
}
