package Oct2026.DSA.BubbleSort;

public class SortElement {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,8,3,4,7};

        for(int i=0; i<arr.length-1 ;i++){
            for(int j = 0 ;j<arr.length-1-i ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
