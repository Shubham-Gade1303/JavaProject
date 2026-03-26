package march_Practice;

public class missingNumber {
    public static void main(String[] args){
        int[] arr = {5,6,8};
        int n = arr.length;

        int exp = n*(n+1)/2;
        int act =0;
        for(int i=0;i<arr.length;i++){
            act = act +arr[i];
        }
        int missing = exp -act;
        System.out.println(missing);
    }
}