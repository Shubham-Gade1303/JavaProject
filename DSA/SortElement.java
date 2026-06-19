public class SortElement {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=0;

                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
