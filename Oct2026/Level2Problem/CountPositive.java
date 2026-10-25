package Oct2026.Level2Problem;

public class CountPositive {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,-1,-2,-5,-6};
        int count =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]> 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
