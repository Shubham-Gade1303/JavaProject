package Oct2026.DSA;

public class MultiplyWithAdjecunt {

    public static void updateArray(int[] arr){
        int n = arr.length;

        int[] temp = new int[n];

        for(int i=0;i<n;i++){
            int pre = (i == 0) ? 1 : arr[i-1];
            int next = (i == n-1) ? 1: arr[i+1];

            temp[i] = pre * arr[i] * next;
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2,4,5};

        updateArray(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
}
