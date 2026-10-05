package Sep2026.DSA.LinearSearch;

public class findIndexOfElement {
    public static void main(String[] args){
        int[] arr = {5,8,12,20,25};
        int target = 20;
        boolean isFound = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                isFound = true;
                System.out.println("Output: "+ i);
            }
        }
        if(!isFound){
            System.out.println("elements is not found.");
        }
}
}
