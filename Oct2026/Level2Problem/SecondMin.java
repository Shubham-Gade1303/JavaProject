package Oct2026.Level2Problem;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0,-1};
        int min =0;
        int smin=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                smin = min;
                min = arr[i];
            }
            else if(arr[i] < smin && arr[i] != min){
                smin = arr[i];
            }
        }
        System.out.println(smin );
    }
}
