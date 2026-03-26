public class SearchA {
    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target=1;

        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found in array....");
        }else{
            System.out.println("Element not found in array...");
        }
    }
}
