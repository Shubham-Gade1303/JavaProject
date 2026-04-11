package RSL_Pracice;
import java.util.*;
public class UniqueElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Element: ");
        for(int  i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("Unique Element: "+ arr[i]+ " ");
                break;
            }
        }
    }
}