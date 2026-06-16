import java.util.Scanner;

public class Searchelemt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to Search : ");
        int k =sc.nextInt();

        boolean found = false;
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                found = true;
                System.out.println("found " + (i+1));
            }
        }
        if(!found){
            System.out.println("Not found..");
        }
    }

}