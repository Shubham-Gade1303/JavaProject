public class CountE {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,910};
        int count =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("The count of EvenNumbers: "+count);

    }
}
