import java.util.Scanner;

public class PlusOne{
    
public int[] newAdd(int[] arr){
    for(int i= arr.length-1;i>=0;i--){

        if(arr[i]<9){
            arr[i]++;
            return arr;
        }

        arr[i]=0;
    }
    int[] result = new int[arr.length+1];
    result[0]=1;

    return result;

}    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter size: ");
          int size = sc.nextInt();
          int[] arr = new int[size];
          for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
          }  
        PlusOne obj = new PlusOne();
          int[] App = obj.newAdd(arr);
       
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}