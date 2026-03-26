public class RevA {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        int str=0;
        int end =arr.length-1;

        while(str<end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;

            str++;
            end--;
        }
        System.out.print("Afetr rev Arry: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
