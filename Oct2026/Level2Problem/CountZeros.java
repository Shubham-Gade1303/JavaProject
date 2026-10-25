package Oct2026.Level2Problem;

public class CountZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,2,30,0,0};

        int count =0;

        for(int num : arr){
            if(num == 0){
                count++;
            }
        }
        System.out.println(count);;
    }
}
