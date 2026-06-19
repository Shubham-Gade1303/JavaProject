public class ToCheckSortedArray {
    
    public static void main(String[] args) {
        int[] arr = {10,40,30,20,50};

        boolean isSort =false;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
            isSort=false;
            break;
            }
            System.out.println("Array is not sorted");
        }
        if(isSort){
            System.out.println("Array is sorted..");
        }
    }
}
