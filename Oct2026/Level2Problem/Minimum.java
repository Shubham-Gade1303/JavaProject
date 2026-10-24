package Oct2026.Level2Problem;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,89,-100};

        int min = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println(min );
    }
}
