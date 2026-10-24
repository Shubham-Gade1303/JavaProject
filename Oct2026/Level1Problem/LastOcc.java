package Oct2026.Level1Problem;

public class LastOcc {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,20,30,};
        int tagret = 20;
        int last = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == tagret){
                last = i;
            }
        }
        System.out.println("last index : " +  last);
    }
}
