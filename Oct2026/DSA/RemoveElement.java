package Oct2026.DSA;

public class RemoveElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int target = 5;
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                for(int j = i;j<n-1;j++){
                    arr[j] = arr[j+1];
                }
                n--;
                i--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
