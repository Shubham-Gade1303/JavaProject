package Sep2026.DSA.LinearSearch;

public class findTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;
        boolean find = false;


        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                find = true;
                System.out.println("Target: "+ target   + " "+ i + " found in array");
            }
        }
        if(!find){
            System.err.println("Not Found");
        }
    }    
}
