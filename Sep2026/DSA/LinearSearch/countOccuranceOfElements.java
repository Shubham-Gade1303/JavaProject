package Sep2026.DSA.LinearSearch;

public class countOccuranceOfElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,1,6,7,8,1,9,10};
        int target=1;
        int count =0;
        boolean isfound = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                isfound = true;
                count++;
            }
        }
        if(isfound){
             System.out.println("Output: "+ count);
        }else{
            System.out.println("Not Found: ");
        }
        
    }
}
