import java.util.*;
public class PluseOne60 {
    public int[] pluseOne(int[] digit){

        for(int i=digit.length-1;i>=0;i--){
            if(digit[i]<9){
                digit[i]++;
                return digit;
            }
            else{
                digit[i]=0;

            }

        }
        int[] newdigit = new int[digit.length+1];
        newdigit[0]=1;
        return newdigit;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter size: ");

        int size = sc.nextInt();

        int[] digit = new int[size];
        System.out.print("Enter array: ");
        for(int i=0;i<size;i++){
            digit[i] = sc.nextInt();
        }

         
        
        PluseOne60 obj = new PluseOne60();
        int[] result = obj.pluseOne(digit); 
        System.out.print("Result: ");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
