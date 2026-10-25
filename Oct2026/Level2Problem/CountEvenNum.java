package Oct2026.Level2Problem;

public class CountEvenNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count =0;

        for(int num : arr){
            if(num % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
