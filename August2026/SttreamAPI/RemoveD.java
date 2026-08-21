package August2026.SttreamAPI;

public class RemoveD {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,6,1,2,44,44};

        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j =0;j<i;j++){
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.print(arr[i]+ " ");
            }
        }
        
    }
}
