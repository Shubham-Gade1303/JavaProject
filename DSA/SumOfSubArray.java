public class SumOfSubArray {
    
    static int SumOfSubArr(int[] arr){
        int n = arr.length;
        int result = 0 ;


        // for(int i=0;i<n;i++){
        //     temp =0;
        //     for(int j =i;j<n;j++){
        //         temp = temp + arr[j];
        //         result= result + temp;
        //     }
        for(int i=0;i<n;i++){
            result += (arr[i]*(i+1)*(n-1));
        
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2};

        System.out.println(SumOfSubArr(arr));
    }
}
