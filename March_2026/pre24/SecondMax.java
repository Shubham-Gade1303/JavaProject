public class SecondMax{
     public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int first = Integer.MIN_VALUE;
        int second =  Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second= first;
                first = arr[i];
            }
            else if(arr[i]> second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("second max: "+second);
    }
}