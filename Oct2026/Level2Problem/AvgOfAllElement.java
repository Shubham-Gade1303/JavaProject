package Oct2026.Level2Problem;

public class AvgOfAllElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        int avg =0;
    
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];

         avg = sum / 5;
        }

        System.out.println(avg);
    }
}
