package Oct2026.Level2Problem;

public class secondMax {
    public static void main(String[] args) {
        
    
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int max = 0;
     int smax =0;

     for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            smax = max;
            max = arr[i];

        }
        else if( arr[i] > smax && arr[i] != max){
            smax = arr[i];
        }
     }

     System.out.println("Second max : " + smax);
    }
}
