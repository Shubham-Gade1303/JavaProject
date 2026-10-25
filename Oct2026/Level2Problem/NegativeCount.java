package Oct2026.Level2Problem;

public class NegativeCount {
    public static void main(String[] args){
        int[] arr = {-1,-2,-3,4,6,5,6};
        int count =0;
        for(int num : arr){
            if(num < 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
