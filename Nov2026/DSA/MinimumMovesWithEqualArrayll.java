package Nov2026.DSA;
import java.util.Scanner;

class MinimuMovesWithEqualArrayll{
    public static  int minMoves(int nums[]){
        int max = nums[0];
        for(int num : nums){
            if( num > max){
                max = num;
            }
        }

        int move =0;
        for(int num : nums){
            move += max - num;
        }
        return move;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.print("Enter Arrays: ");
        for(int i=0;i<size;i++){
            nums[i]= sc.nextInt();
        }

        int result = minMoves(nums);
        System.out.print("Output: "+ result);
    }
}